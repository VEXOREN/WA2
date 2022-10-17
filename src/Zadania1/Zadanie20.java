package Zadania1;

import java.util.Scanner;

    public class Zadanie20 {
        public static void main(String[] args) {
            Scanner klawiatura = new Scanner(System.in);
            System.out.println("Wprowadź zdeponowaną kwotę: ");
            double kwotazdeponowana = klawiatura.nextDouble();
            klawiatura.nextLine();
            System.out.println("Wprowadź roczną stopę oprocentowania, w postaci ułamka dziesiętnego: ");
            double rocznastopaoprocent = klawiatura.nextDouble();;
            klawiatura.nextLine();
            // liczba kapitalizacji odsetek w ciągu roku
            System.out.println("Wprowadź liczbę kapitalizacji: ");
            double kapitalizacja = klawiatura.nextDouble();
            klawiatura.nextLine();
            // liczba lat , przez jakie środki będą znajdować się na koncie i generować odsetki
            System.out.println("Wprowadź liczbę lat: ");
            double llat = klawiatura.nextDouble();
            klawiatura.nextLine();
            // wzor na obliczenie stanu konta po okreslonej liczbie lat
            double pot = kapitalizacja * llat;
            double wzorwnawiasie = 1+(rocznastopaoprocent/kapitalizacja);
            int potega = (int)Math.pow(wzorwnawiasie, pot);
            double  wynikpotegi = wzorwnawiasie + potega;
            double wzor = kwotazdeponowana * wynikpotegi;
            System.out.println("Kwota pieiędzy na koncie po okreslonej liczbie lat: " + wzor + " zł.");

        }
    }
