package entities;

import java.util.Comparator;

public class MyComparator implements Comparator<ProductComparator> {

    @Override
    public int compare(ProductComparator product1, ProductComparator product2) {
        return product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase());
    }
}
