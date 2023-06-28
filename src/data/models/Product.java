package data.models;

public class Product { /*Объект этого класса - продукт из каталога магазина. Поля класса - информация о продукте.*/
    public  final String id;
    public  final String title;
    public  final String description;
    public  final int price;
    public  final boolean available;

    public Product(String id, String title, String description, int price, boolean available) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.available = available;
    }
}
