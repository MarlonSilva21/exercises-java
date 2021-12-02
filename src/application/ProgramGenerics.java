package application;

import model.services.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class ProgramGenerics {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);

        PrintService<Integer> printService = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            printService.addValue(value);
        }

        printService.print();
        System.out.print("First: " + printService.first());

        sc.close();

    }
}
