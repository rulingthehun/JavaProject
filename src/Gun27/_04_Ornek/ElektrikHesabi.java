package Gun27._04_Ornek;

public class ElektrikHesabi {
    int toplamTuketim = 0;
    double birimFiyat = 0.7;
    double fatura = 0;

    void tuketimEkle(int gelenTuketim) {
        toplamTuketim += gelenTuketim;
    }

    void faturaYaz(String musteriAdi) {
        double toplamTutar = toplamTuketim * birimFiyat;
        System.out.println("musteriAdi = " + musteriAdi);
        System.out.println("toplamTutar = " + Math.round(toplamTutar));
    }

    void toplamTuketimYaz() {
        System.out.println("toplamTuketim = €" + toplamTuketim);
    }

}
