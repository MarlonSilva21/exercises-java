package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.OnlinePaymentService;
import model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramContractInterface {

    public static void main(String[] args) throws ParseException {

        final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter contract data: ");
        System.out.print("Number: ");
        Integer number = sc.nextInt();

        System.out.print("Date (dd/mm/yyyy): ");
        Date date = SDF.parse(sc.next());

        System.out.print("Contract value: ");
        Double totalValue = sc.nextDouble();

        System.out.print("Enter number of installments: ");
        int installments = sc.nextInt();

        Contract contract = new Contract(number, date, totalValue);
        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, installments);

        System.out.println("Installments:");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }




        sc.close();

    }
}
