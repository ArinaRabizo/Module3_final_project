package data.models;

public class CartItem { /*Объект этого класса - продукт из каталога в корзине. Поля класса - сам продукт и
                        его количество*/
    public final Product product;
    public final int count;

    public CartItem(Product product, int count) {
        this.product = product;
        this.count = count;
    }
}
