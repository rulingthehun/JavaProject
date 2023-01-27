package Gun40._01_Ornek;

public class Kartal extends Hayvan{
    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("Etcil");
    }

    @Override
    void yemekMiktari() {
        System.out.println("Gunluk 60-80 kcal/kg");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("Gunluk 10 saat");
    }

    @Override
    void sesi() {
        System.out.println("ciiiigh");
    }
}
