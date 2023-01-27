package Gun34._02_Ornek;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kopek kopek1 = new Kopek("Beyaz", 20, "Kangal");
        kopek1.konustu();

        Ordek ordek1 = new Ordek("Siyah", 10,
                "Pekin", 1);
        System.out.println("ordek1 = " + ordek1);
        System.out.print("Ordek konustu: ");
        ordek1.konustu();
    }
}
