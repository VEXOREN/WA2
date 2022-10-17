package Zadania1;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        double podstan = 0.04;
        double podlok = 0.02;




        Scanner klawiatura = new Scanner(System.in);


        System.out.println("Podaj wartość produktu: ");
        double wart = klawiatura.nextDouble();
        klawiatura.nextLine();
        double wartpodstan = podstan * wart;
        double wartpodlok = wart * podlok;
        double wartprodzpod = wart + wartpodstan + wartpodlok;

        System.out.println("Wartość produktu to: " + wart + "zł .");
        System.out.println("Wartość podatku stanowego dla tego produktu wynosi: " + wartpodstan + "zł .");
        System.out.println("Wartość podatku lokalnego dla tego produktu wynosi: " + wartpodlok + "zł .");
        System.out.println("Całkowita wartość produktu to: " + wartprodzpod + "zł .");


    }
}
