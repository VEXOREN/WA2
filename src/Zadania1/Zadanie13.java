package Zadania1;

import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj wynik testu pierwszego: ");
        double test1 = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("Podaj wynik testu drugiego: ");
        double test2 = klawiatura.nextDouble();
        klawiatura.nextLine();


        System.out.println("Podaj wynik testu trzeciego: ");
        double test3 = klawiatura.nextDouble();
        klawiatura.nextLine();

        double sredniatest = (test1+test2+test3) /3 ;

        System.out.println("Wynik pierwszego testu: " + test1 + "% , wynik drugiego testu: " + test2 + "% , wynik trzeciego testu: " +test3 + "% ." );
        System.out.println("Średnia wszystkich testów: " + sredniatest + " .");

    }
}
