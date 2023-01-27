package Gun37._06_Soru_prev;

public class GeometriMain {
    public static void main(String[] args) {
        Kare k = new Kare();
        System.out.println("Kare cevre = " + k.cevre(4));
        System.out.println("Kare alan = " + k.alan(4));

        Dikdortgen d = new Dikdortgen();
        System.out.println("Dikdortgen cevre = " + d.cevre(3,5));
        System.out.println("Dikdortgen alan = " + d.alan(3,5));
    }
}
