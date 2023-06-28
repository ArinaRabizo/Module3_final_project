package View;

import data.services.ShopService;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderView extends AppView{ /*Класс является наследником класса AppView, реализует его
    методы. Объект класса определяет, что будет показано на экране при выборе раздела Order. В классе есть метод action(),
    который создает заказ с данными пользователя*/
    final ShopService shopService;

    public OrderView(ShopService shopService) {
        super("Ordering", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc1.nextLine();
        System.out.println("Enter your phone: ");
        String phone = sc1.nextLine();
        shopService.createOrder(name, phone, "Moscow", "МИР", "22-00");


        }
    }
