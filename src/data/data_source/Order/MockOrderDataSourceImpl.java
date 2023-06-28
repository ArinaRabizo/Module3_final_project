package data.data_source.Order;

import data.models.Order;

public class MockOrderDataSourceImpl extends OrderDataSource{ /*Этот класс - источник данных заказа. Здесь есть метод
создания заказа и получения информации о заказе. Класс является наследником абстрактного класса OrderDataSource и
реализует его методы*/
    private Order order;
    @Override
    public void createOrder(Order order) {
        this.order = order;
    }

    @Override
    public Order getOrder() {
        return order;
    }
}
