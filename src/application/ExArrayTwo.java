package application;

import entities.ProductArray;

import java.util.Locale;
import java.util.Scanner;

public class ExArrayTwo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ProductArray[] vet = new ProductArray[n];

        for (int i = 0; i  < vet.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vet[i] = new ProductArray(name, price);
        }

        double sum = 0;
        for (ProductArray productArray : vet) {
            sum += productArray.getPrice();
        }

        double avg = sum / vet.length;

        System.out.printf("Average Price: %.2f%n ", avg);

        sc.close();

    }
}
