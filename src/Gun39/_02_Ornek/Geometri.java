package Gun39._02_Ornek;

public class Geometri {
    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen("Dikdortgen", 4, 6);
        System.out.println(dikdortgen);

        Daire daire = new Daire("Daire", 3);
        System.out.println(daire);

        Daire daire2 = new Daire("Daire2", 7.12);
        System.out.println(daire2);

        Kure kure = new Kure("Kure", 8.53);
        System.out.println(kure);
        kure.ciz();
    }
}
