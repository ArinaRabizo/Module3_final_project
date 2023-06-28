package data.services;

import data.data_source.Cart.CartDataSource;
import data.data_source.Catalog.CatalogDataSource;
import data.data_source.Order.OrderDataSource;
import data.models.CartItem;
import data.models.Order;
import data.models.Product;

import java.util.ArrayList;

public class ShopService { /*Объект этого класса - "управляет магазином". У него есть информация о корзине, заказе
 и каталоге, он возвращает каталог, корзину или заказ. Также он может добавлять продукты в корзину, создавать новый
 заказ*/
    final CatalogDataSource catalogDataSource;
    final CartDataSource cartDataSource;
    final OrderDataSource orderDataSource;

    public ShopService(CatalogDataSource catalogDataSource, CartDataSource cartDataSource, OrderDataSource orderDataSource) {
        this.catalogDataSource = catalogDataSource;
        this.cartDataSource = cartDataSource;
        this.orderDataSource = orderDataSource;
    }

    public ArrayList<Product> getCatalog() {
        return catalogDataSource.getCatalog();
    }
    public boolean addToCart(String productID, int count) {
        ArrayList<Product> products = getCatalog();
        for (Product p : products) {
            if (p.id.equals(productID) && p.available) {
                cartDataSource.addToCart(p, count);
                return true;
            }
        }
        return false;
    }
    public ArrayList<CartItem> getCart(){
        return cartDataSource.getCart();
    }
    public void createOrder(String name, String phone, String address, String paymentType, String deliveryTime) {
        ArrayList<CartItem> cart = cartDataSource.getCart();
        Order newOrder = new Order(name, phone, address, paymentType, deliveryTime, cart);
        orderDataSource.createOrder(newOrder);
    }
    public Order getOrder() {
        return orderDataSource.getOrder();
    }
}
