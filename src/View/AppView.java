package View;

import java.util.ArrayList;

public abstract class AppView { /*Этот абстрактный класс является родителем для всех классов VIEW. Эти классы отвечают
за то, что происходит, когда пользователь выбирает один из вариантов в меню - корзина, каталог, заказ или возвращение
назад. Поля этого класса - название "страницы", на которую попадает пользователь, а также ArrayList children -
он содержит в себе объекты AppView, при выборе которых пользователь попадает в один из разделов магазина - каталог,
корзина или заказ. Класс также имеет метод, который позволяет показать объекты children, абстрактный метод action,
который определяет, что пользователь видит на экране при выборе того или иного раздела сайта*/
    public final String title;
    public final ArrayList<AppView> children;

    public AppView(String title, ArrayList<AppView> children) {
        this.title = title;
        this.children = children;
    }
    public abstract void action();
    public void displayChildren () {
        System.out.println(title);
        System.out.println("Choose from 1 to " + (children.size() + 1) + ":");
        for (int i = 0; i < children.size(); i++) {
            System.out.println((i + 1) + " - " + children.get(i).title);
        }
        System.out.println((children.size() + 1) + " - Back");
    }
}
