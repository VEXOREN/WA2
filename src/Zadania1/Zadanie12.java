package Zadania1;

import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int porciast = 4;
        int kalpor = 300;
        //liczba kalorii jednego ciastka
        double lkal = kalpor / porciast;

        System.out.println("Proszę wprowadzić liczbę zjedzonych ciastek: ");
        double wartzjedzciast = klawiatura.nextDouble();
        klawiatura.nextLine();

        double wartciast = lkal * wartzjedzciast;

        System.out.println("Liczba kalorii skonsumpowanych ciastek to: " + wartciast + "cal ."   );

    }
}
