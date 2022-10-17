package Zadania1;

public class Zadanie17 {
        public static void main(String[] args) {
        int lakcji = 600;
        double akcja = 21.77;
        double wartakcji = lakcji * akcja;
        double wysprow = (wartakcji * 0.02);
        double wartakcjizprow = wysprow + wartakcji;
            System.out.println("Kwota zapłacona za same akcje to: " + wartakcji);
            System.out.println("Wysokosc prowizji to: " + wysprow);
            System.out.println("Łączna kwota to: " + wartakcjizprow);

    }
}
