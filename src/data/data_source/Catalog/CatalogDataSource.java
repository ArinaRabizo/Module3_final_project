package data.data_source.Catalog;

import data.models.Product;

import java.util.ArrayList;

public abstract class CatalogDataSource { /*Этот абстрактный класс является родителем для всех классов, которые
содержат информацию о каталоге.*/
    public abstract ArrayList<Product> getCatalog();
}
