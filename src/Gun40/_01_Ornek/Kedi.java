package Gun40._01_Ornek;

public class Kedi extends Hayvan{
    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
//        int a = 5;
        super(isim, vahsi, dogumTarihi); //sub class Constructor'inda once hicbir sey yazilamaz
//        Inheritance'da her zaman oncelikle extends class calisir
        int a = 5;
    }

    @Override
    void yiyecegi() {
        System.out.println("Hem etcil hem otcul");
    }

    @Override
    void yemekMiktari() {
        System.out.println("Gunluk 60-80 kcal/kg");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("Gunluk 16 saat");
    }

    @Override
    void sesi() {
        System.out.println("Miyav");
    }

}
