package Zadania1;

import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj cenę detaliczną płytki: ");
        double detprice = klawiatura.nextDouble();
        klawiatura.nextLine();

        double marza = 0.4;
        double zysk = detprice / marza;

        System.out.println("Zysk sprzedaży produktu: " + zysk + "zł .");

    }
}
