package data.data_source.Order;

import data.models.Order;

public abstract class OrderDataSource { /*Этот абстрактный класс является родителем для всех классов, которые содержат информацию
    о заказе. Здесь есть методы создания заказа и получения информации о заказе.*/
    public abstract void createOrder(Order order);
    public abstract Order getOrder();

}
