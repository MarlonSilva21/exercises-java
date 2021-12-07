package application;

import entities.MyComparator;
import entities.ProductComparator;

import java.util.ArrayList;
import java.util.List;

public class ProgramProductComparator {

    public static void main(String[] args) {

        List<ProductComparator> list = new ArrayList<>();

        list.add(new ProductComparator("Tv",900.0));
        list.add(new ProductComparator("Notebook",1900.0));
        list.add(new ProductComparator("Tablet",500.0));

        list.sort(new MyComparator());

        /* Método alternativo de usar o Comparator com uma lambda
        *
        *  list.sort((p1, p2) -> product1.getName.toUpperCase().compareTo(product2.getName.toUpperCase());
        *
        * */

        for (ProductComparator p : list){
            System.out.println(p);
        }
    }
}
