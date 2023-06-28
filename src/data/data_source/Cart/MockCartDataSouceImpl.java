package data.data_source.Cart;

import data.models.CartItem;
import data.models.Product;

import java.util.ArrayList;

public class MockCartDataSouceImpl extends CartDataSource{ /*Этот класс - источник данных для корзины. Здесь есть метод
добавления в корзину продуктов и получения корзины. Класс является наследником абстрактного класса CartDataSource и
реализует его методы*/
    private ArrayList<CartItem> cart = new ArrayList<>();
    @Override
    public ArrayList<CartItem> getCart() {
        return cart;
    }

    @Override
    public void addToCart(Product product, int count) {
        cart.add(new CartItem(product, count));
    }
}
