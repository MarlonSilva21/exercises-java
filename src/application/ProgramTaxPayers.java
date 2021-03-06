package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramTaxPayers {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of taxpayers: ");
        int n = sc.nextInt();

        List<TaxPayer> list = new ArrayList<TaxPayer>();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nTaxpayer #" + i + " data: ");
            System.out.print("Individual or Company (i/c)? ");
            char type = sc.next().toLowerCase().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Annual income: ");
            Double annualIncome = sc.nextDouble();

            if(type == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();

                list.add(new Individual(name, annualIncome, healthExpenditures));
            }
            else{
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = sc.nextInt();

                list.add(new Company(name, annualIncome, numberOfEmployees));
            }

        }

        System.out.println("\nTAXES PAID: ");

        for(TaxPayer tp: list){
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
        }

        System.out.println();

        double sum = 0.0;
        for(TaxPayer tp: list){
            sum += tp.tax();
        }
        System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));

        sc.close();
    }
}
