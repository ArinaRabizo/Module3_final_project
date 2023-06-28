package View;

import data.services.ShopService;

import javax.swing.text.View;
import java.util.ArrayList;
import java.util.Scanner;

public class AddToCartView extends AppView { /*Класс является наследником класса AppView, реализует его
 методы. Объект класса определяет, что будет показано на экране при выборе раздела AddToCart в разделе Catalog.
  В классе есть метод action(), который добавляет продукт в корзину*/
    final ShopService shopService;

    public AddToCartView(ShopService shopService) {
        super("Add to cart", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter product id: ");
        String productID = sc1.nextLine();
        System.out.println("Enter count: ");
        int count = sc1.nextInt();
        boolean result = shopService.addToCart(productID, count);
        if (result) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }
}
