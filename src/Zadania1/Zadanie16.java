package Zadania1;

import java.util.Scanner;

    public class Zadanie16 {
        public static void main(String[] args) {
            Scanner klawiatura = new Scanner(System.in);
            System.out.println("Wprowadź cenę posiłku: ");
            double price = klawiatura.nextDouble();
            klawiatura.nextLine();
            double wartpodatek = 0.0675;
            double obliczeniepodatku = (price * wartpodatek);
            double poziomnapiwku = 0.2;
            double napiwek = ((obliczeniepodatku + price) * poziomnapiwku);
            double wartnapiwku = (obliczeniepodatku + price) - napiwek;
            double calkwartnapiwku = (price + obliczeniepodatku) - wartnapiwku;
            double lacznacena = price + obliczeniepodatku + calkwartnapiwku;
            System.out.println("Cena posiłku to: " + price);
            System.out.println("Wartosc podatku to: " + obliczeniepodatku);
            System.out.println("Wysokosc napiwku to: " + calkwartnapiwku);
            System.out.println("Łączna cena to: " + lacznacena);

        }
    }
