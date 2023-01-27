package Gun30.Soru;

public class Banka {
    // Hesap (yatan(int), cekilen(int), bakiye(int)(direk erişim olmamalı))
    // Musteri (hesapID(int), ad, soyad, MusteriHesap(Hesap tipinde))
    // Bir banka uygulaması için 1 müşteri tanımlayınız,
    // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
    // Müşteirinin toplam yatanı, toplam cekileni ve kalan bakiyesini yazdırınız.
    // bakiyeye direk para atanamadıgını kontrol ediniz.
    public static void main(String[] args) {
        Musteri mus1 = new Musteri();
        mus1.hesapID = 2202;
        mus1.ad = "Burak";
        mus1.soyad = "Gaznepoglu";
        mus1.hesap = new MusteriHesap();
        mus1.hesap.paraYatir(100);
        mus1.hesap.paraYatir(200);
        mus1.hesap.paraCek(50);
        System.out.println("mus1.hesap = " + mus1.hesap);
    }
}
