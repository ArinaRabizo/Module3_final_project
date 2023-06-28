import View.*;
import data.data_source.Cart.CartDataSource;
import data.data_source.Cart.MockCartDataSouceImpl;
import data.data_source.Catalog.CatalogDataSource;
import data.data_source.Catalog.MockCatalogDataSourceImpl;
import data.data_source.Order.MockOrderDataSourceImpl;
import data.data_source.Order.OrderDataSource;
import data.services.ShopService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) { /*В классе main создаются catalogDataSource, cartDataSource, orderDataSource
    shopService, addToCartView, cartView, orderView, catalogChildren, mainChildren, mainView и pageLoop,
    каждому объекту классов View присваиваются их дети и с помощью метода pageloop.run запускается магазин*/
        CatalogDataSource catalogDataSource = new MockCatalogDataSourceImpl();
        CartDataSource cartDataSource = new MockCartDataSouceImpl();
        OrderDataSource orderDataSource = new MockOrderDataSourceImpl();

        ShopService shopService = new ShopService(catalogDataSource, cartDataSource, orderDataSource);



        AppView addToCartView = new AddToCartView(shopService);

        AppView cartView = new CartView(shopService);

        AppView orderView = new OrderView(shopService);

        ArrayList<AppView> catalogChildren = new ArrayList<>();
        catalogChildren.add(addToCartView);

        AppView catalogView = new CatalogView(catalogChildren, shopService);

        ArrayList<AppView> mainChildren = new ArrayList<>();
        mainChildren.add(catalogView);
        mainChildren.add(cartView);
        mainChildren.add(orderView);

        AppView mainView = new MainView(mainChildren);

        PageLoop pageLoop = new PageLoop(mainView);
        pageLoop.run();

    }
}