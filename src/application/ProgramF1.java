package application;

import java.util.Scanner;

public class ProgramF1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double  comprimentoPista, reabastecimento;
        int voltas, voltasParada, nmrReabastecimento, consumo;

        System.out.print("Informe o comprimento da pista em metros: ");
        comprimentoPista = sc.nextDouble();

        System.out.print("Informe as voltas a serem percorridas: ");
        voltas = sc.nextInt();

        System.out.print("Número de reabastecimentos: ");
        nmrReabastecimento = sc.nextInt();

        System.out.print("Qual o consumo de combustível (Km/L)? :");
        consumo = sc.nextInt();

        voltasParada = voltas / nmrReabastecimento;
        reabastecimento = (voltasParada * comprimentoPista) ;

        System.out.print("Total de combustível até o 1° reabastecimento " + reabastecimento + " Litros");

        sc.close();
    }
}
