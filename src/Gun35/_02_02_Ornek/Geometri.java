package Gun35._02_02_Ornek;

public class Geometri {
    public static void main(String[] args) {
        Daire d = new Daire(5);
        System.out.println(d);
        System.out.println("Daire alan = " + d.alan());
        System.out.println("Daire cevre = " + d.cevre());

        Dikdortgen dd =
                new Dikdortgen(2, 3);
        System.out.println(dd);
        System.out.println("Dikdortgen alan = " + dd.alan());
        System.out.println("Dikdortgen cevre = " + dd.cevre());

        Kare k = new Kare(2);
        System.out.println(k);
        System.out.println("Kare alan = " + k.alan());
        System.out.println("Kare cevre = " + k.cevre());
    }
}
