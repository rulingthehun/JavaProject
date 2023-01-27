package Gun35._02_01_Ornek;

public class GeoMain {
    public static void main(String[] args) {
        Kare yKare = new Kare(3.55);
        System.out.println(yKare);
        System.out.println("Kare alan = " + yKare.kareAlan() + " cm");
        System.out.println("Kare cevre = " + yKare.kareCevre() + " cm");
        Dikdortgen yDikdortgen = new Dikdortgen(2.74, 6.81);
        System.out.println(yDikdortgen);
        System.out.println("Dikdortgen Alan = " +
                yDikdortgen.dikdortgenAlan() + " cm");
        System.out.println("Dikdortgen Cevre = " +
                yDikdortgen.dikdortgenCevre() + " cm");
        Daire yDaire = new Daire(2.88);
        System.out.println("yDaire = " + yDaire);
        System.out.println("Daire Alan = " + yDaire.daireAlan() + " cm");
        System.out.println("Daire Cevre = " + yDaire.daireCevre() + " cm");
    }
}
