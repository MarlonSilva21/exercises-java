package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployees {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Employees: ");
        int numberEmployees =sc.nextInt();

        List<Employee> listEmployee = new ArrayList<>();

        for(int i = 1; i <= numberEmployees; i++){

            System.out.println("Employee #" + i + "data: ");

            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().toLowerCase().charAt(0);

            sc.nextLine();
            System.out.print("\nName: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if(ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                listEmployee.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
            else{
                listEmployee.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("\nPAYMENTS: ");

        for(Employee emp: listEmployee){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f ", emp.payment()));
        }

        sc.close();
    }
}
