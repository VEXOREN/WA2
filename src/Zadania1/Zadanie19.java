package Zadania1;

import java.util.Scanner;

    public class Zadanie19 {
        public static void main(String[] args) {
            double ilszklanekcukru = (1.5 / 48);
            double ilszklanekmasla = (0.02);
            double ilszklanekmaki = (2.75 / 48 );
            Scanner klawiatura = new Scanner(System.in);
            System.out.println("Wprowadź liczbe ciasteczek: ");
            double lciastek = klawiatura.nextDouble();
            klawiatura.nextLine();
            double ilcukru = ilszklanekcukru * lciastek;
            double ilmasla = ilszklanekmasla * lciastek;
            double ilmaki = ilszklanekmaki * lciastek;


            System.out.println("Do zrobienia ciastek pędziesz potrzebował: ");
            System.out.printf(" - %.1f" , ilcukru);
            System.out.print(" szklanki cukru. \n");
            System.out.printf(" - %.1f" , ilmaki);
            System.out.print(" szklanki maki.\n");
            System.out.printf(" - %.1f" , ilmasla);
            System.out.print(" szklanki masła.\n");




        }
    }
