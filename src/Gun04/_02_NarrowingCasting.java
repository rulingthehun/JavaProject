package Gun04;

public class _02_NarrowingCasting {
    public static void main(String[] args) {
        double oran=3.2;
        int sayi=5;
        sayi=(int)oran;
        System.out.println("sayi = " + sayi); //cikti=3
        long genelToplam=370878787788860L;
        sayi=(int)genelToplam; //Cikti "sayi = -228155332" Veri kaybi var.
        System.out.println("sayi = " + sayi);
    }
}
