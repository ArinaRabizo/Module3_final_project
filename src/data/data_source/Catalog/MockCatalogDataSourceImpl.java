package data.data_source.Catalog;

import data.models.Product;

import java.util.ArrayList;

public class MockCatalogDataSourceImpl extends CatalogDataSource { /*Этот класс - источник данных для каталога
. Здесь есть метод getCatalog, который создает и реализует каталог. Класс является наследником абстрактного класса CatalogDataSource
 и реализует его методы*/
    @Override
    public ArrayList<Product> getCatalog() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("id1", "SmartPhone", "Really good new smartPhone", 10000, true));
        products.add(new Product("id2", "Laptop", "Really good new Laptop", 55000, true));
        products.add(new Product("id3", "SmartWatch", "Really good new smartWatch", 17000, true));
        products.add(new Product("id4", "EarPods", "Really good new EarPods", 8000, true));
        return products;
    }
}
