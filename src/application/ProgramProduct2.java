package application;

import entities.Client;
import entities.Order2;
import entities.OrderItem;
import entities.Product2;
import entities.enums.OrderStatus2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct2 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthdate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthdate);


        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus2 status = OrderStatus2.valueOf(sc.next());

        System.out.print("How many items to this order? ");
        int orderQuantity = sc.nextInt();

        Order2 order = new Order2(new Date(), status, client);

        for(int i = 1; i <= orderQuantity; i++ ){

            System.out.println("Enter #" + i + "item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.println("Quantity: ");
            int quantity = sc.nextInt();

            Product2 product = new Product2(productName, productPrice);
            OrderItem it = new OrderItem(quantity, productPrice, product);

            order.addItems(it);

        }
        System.out.print("\n" + order);

        sc.close();

    }
}
