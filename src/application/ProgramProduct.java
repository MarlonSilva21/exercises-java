package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String nome = sc.nextLine();

        System.out.print("Price: ");
        double preco = sc.nextDouble();

        Product product = new Product(nome, preco);
        product.setNome("Grupo 4");

        System.out.println("Product upadate: "+ product.getNome());


        System.out.println("Product data: " + product);
        System.out.print("\nEnter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.print("\nUpdate data: " + product);

        System.out.print("\nEnter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.print("\nUpdate data: " + product);

        sc.close();
    }
}
