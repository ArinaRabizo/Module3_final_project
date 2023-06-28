package View;

import java.util.ArrayList;

public class MainView extends AppView{ /*Класс является наследником класса AppView, реализует его
    методы. Объект класса определяет, что будет показано на экране при запуске магазина.*/

    public MainView(ArrayList<AppView> children) {
        super("Shop", children);
    }

    @Override
    public void action() {

    }
}
