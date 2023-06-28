package View;

import data.models.Product;
import data.services.ShopService;

import java.util.ArrayList;

public class CatalogView extends AppView { /*Класс является наследником класса AppView, реализует его
    методы Объект класса определяет, что будет показано на экране при выборе раздела Catalog. В классе есть метод action(),
    который выводит на экран содержимое каталога*/
    final ShopService shopService;

    public CatalogView(ArrayList<AppView> children, ShopService shopService) {
        super("Catalog", children);
        this.shopService = shopService;
    }

    @Override
    public void action() {
        ArrayList<Product> catalog = shopService.getCatalog();
        for (Product p : catalog) {
            System.out.println(p.id + " " + p.title + " " + p.price);
        }
        System.out.println();
    }
}
