package Zadania1;

import java.text.DecimalFormat;

public class Zadanie18 {
    private static double loskup1energetykcytryn;

    public static void main(String[] args) {

            int lkons = 12467;
            double prooskupjedenenergetyk = 0.14;
            double loskupjedenenergetyk = (lkons * prooskupjedenenergetyk);
            double prooskupjedenenergetykcytryn = 0.64;
            double loskup1energetykcytryn = (lkons * prooskupjedenenergetykcytryn);
            int liczba = 40 - (2*5);
            System.out.printf(" liczbę ankietowanych osób, które kupują przynajmniej jeden napój \n" +
                    "energetyczny tygodniowo: %.0f" , loskupjedenenergetyk);
            System.out.print(" osób.\n");
            System.out.printf("liczba ankietowanych osób, które preferują napoje energetyczne o \n" +
                    "smaku cytrusowym: %.0f" , loskup1energetykcytryn);
            System.out.print(" osób. \n");

        }
}
