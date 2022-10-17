package Zadania1;

import java.util.Scanner;

    public class Zadanie15 {
        public static void main(String[] args) {
            Scanner klawiatura = new Scanner(System.in);

            System.out.println("Wprowadź nazwę ulubionego miasta: ");
            String cityname = klawiatura.nextLine();
            int dlugosc = cityname.length();
            String male;
            cityname = cityname.toUpperCase();
            male = cityname.toLowerCase();
            char inicjal = cityname.charAt(0);
            System.out.println("Nazwa tego miasta ma: " + dlugosc + " znaków; \n Nazwa zapisana dużymi literami to: " + cityname + " ;\n Nazwa zapisana małymi literami to: " + male + " ;\n Pierwszy znak to: " + inicjal + " .\n");



        }
}
