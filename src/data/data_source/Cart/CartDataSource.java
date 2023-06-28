package data.data_source.Cart;

import data.models.CartItem;
import data.models.Product;

import java.util.ArrayList;

public abstract class CartDataSource { /*Этот абстрактный класс является родителем для всех классов, которые содержат информацию
о корзине.*/
    public  abstract ArrayList<CartItem> getCart ();
    public  abstract void addToCart (Product product, int count);
}
