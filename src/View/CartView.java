package View;

import data.models.CartItem;
import data.services.ShopService;

import java.util.ArrayList;

public class CartView extends AppView { /*Класс является наследником класса AppView, реализует его
    методы. Объект класса определяет, что будет показано на экране при выборе раздела Cart. В классе есть метод action(),
    который выводит на экран содержимое корзины*/
    final ShopService shopService;

    public CartView(ShopService shopService) {
        super("Cart", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {
        ArrayList<CartItem> cart = shopService.getCart();
        for (CartItem item : cart)  {
            System.out.println(item.product.title + " " + item.count + " pt.");
        }
        System.out.println();
    }
}
