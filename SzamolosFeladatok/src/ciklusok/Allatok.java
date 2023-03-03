package ciklusok;

public class Allatok {
    public static void main(String[] args) {
        /*2.Valaki sertést, kecskét és juhot vásárolt, összesen 100 állatot, pontosan 100 aranyért.
            A sertés darabja 3 és fél arany,
            a kecskéé 1 és egyharmad,
            a juhé fél arany.
    Hány darabot vehetett az egyes állatokból?*/
        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100 - x; y++) {
                int z = 100 - x - y;
                if (3.5*x + (4.0/3)*y + 0.5*z == 100) {
                    System.out.println("Sertés: " + x + " db, Kecske: " + y + " db, Juh: " + z + " db");
                }
            }
        }

    }
}
