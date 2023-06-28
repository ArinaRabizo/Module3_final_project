package View;

import java.util.Scanner;

public class PageLoop { /*Объект этого класса отвечает за возможность выбрать один из разделов магазина*/
    final AppView view;

    public PageLoop(AppView view) {
        this.view = view;
    }
    public void run() {
        while (true) {
            view.action();
            view.displayChildren();
            Scanner sc1 = new Scanner(System.in);
            int value = sc1.nextInt();
            if (value < 0 || value > view.children.size() + 1) {
                System.out.println("Wrong value!");
            } else if (value == view.children.size() + 1) {
                break;
            } else {
                AppView selectedView = view.children.get(value - 1);
                new PageLoop(selectedView).run();
            }
        }
    }

}
