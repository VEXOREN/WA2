public class Zadanie6 {
        public static void main(String[] args) {
            int wymiarypomieszczenia1 = 3*4;
            int wymiarypomieszczenia2 = 3*4;
            int wymiarypomieszczenia3 = 2*3;
            int wymiarypomieszczenia4 = 2*2;
            int osoby = 4;
            System.out.println("Pomiesczenie 1 ma powierzchnię: " + wymiarypomieszczenia1 + "m2");
            System.out.println("Pomiesczenie 2 ma powierzchnię: " + wymiarypomieszczenia2 + "m2");
            System.out.println("Pomiesczenie 3 ma powierzchnię: " + wymiarypomieszczenia3 + "m2");
            System.out.println("Pomiesczenie 4 ma powierzchnię: " + wymiarypomieszczenia4 + "m2");
            System.out.println("Wszystkie pomiesczenia mają powierzchnię: " + (wymiarypomieszczenia1 + wymiarypomieszczenia2 + wymiarypomieszczenia3 + wymiarypomieszczenia4) + "m2");
            System.out.println("Na jedną osobę wypada: " + ((wymiarypomieszczenia1 + wymiarypomieszczenia2 + wymiarypomieszczenia3 + wymiarypomieszczenia4) / osoby) + "m2");
        }
    }


