package data.models;

import java.util.ArrayList;

public class Order { /*Объект этого класса - заказ. Он создается, когда пользователь заказывает вещи из корзины.
Поля класса - данные пользователя, которые он вводит, чтобы заказать продукты из магазина и ArrayList<CartItem> - это
список продуктов, которые лежат в корзине - их пользователь будет "заказывать" */
    public final String name;
    public final String phone;
    public final String address;
    public final String paymentType;
    public final String deliveryTime;
    public final ArrayList<CartItem> cart;

    public Order(String name, String phone, String address, String paymentType, String deliveryTime, ArrayList<CartItem> cart) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.paymentType = paymentType;
        this.deliveryTime = deliveryTime;
        this.cart = cart;
    }
}