import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Proszę wprowadzić liczbę przejechanych kilometrów: ");
        double wartkm = klawiatura.nextDouble();
        klawiatura.nextLine();


        System.out.println("Proszę wprowadzić liczbę zużytych litrów paliwa: ");
        double wartpal = klawiatura.nextDouble();
        klawiatura.nextLine();

        double kmonl = wartkm / wartpal;

        System.out.println("Liczba kilometrów przejechanych na litrze to: " + kmonl + "km/l .");

    }
}
