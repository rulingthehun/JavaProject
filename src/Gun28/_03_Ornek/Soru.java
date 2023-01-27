package Gun28._03_Ornek;

// Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
// 1- Lesson : fields : name, saat (1-10 arasında değer alıyor).
// 2- Student: fields : name, maxSaat, dersleri
// listesini tutacak bir liste.
// 3- 3 adet ders oluşturunuz.
// 4- 1 adet öğrenci tanımlayınız alabileceği
// maxCredit si 10 olsun.
// 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
//    ders eklerken max alabileceği Saati geçmemeli, geçerse
//    uyarı versi, alabileceğiniz max Saati doldu şeklinde.
// 6- Unıversıte kurallarını yazdıran
// 2 maddelik bir not yazdıran metod ekleyinız.

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {
        Scanner intOku = new Scanner(System.in);
        Scanner strOku = new Scanner(System.in);
        Ogrenci ogr1 = new Ogrenci();
        kurallar();
        ogr1.ogrAdi = "Burak";
        ogr1.ogrSoyadi = "Gaznepoglu";
        ogr1.ogrNo = 221903521;
        int alinanKredi = 0;
        String cevap;
        do {
            System.out.println("1 - " + Dersler.ders1 + " " + Dersler.gPKredi + " kredi");
            System.out.println("2 - " + Dersler.ders2 + " " + Dersler.matKredi + " kredi");
            System.out.println("3 - " + Dersler.ders3 + " " + Dersler.gTKredi + " kredi");
            System.out.println("Almak istediginiz dersi secin = ");
            int secim = intOku.nextInt();
            switch (secim) {
                case 1:
                    alinanKredi += Dersler.gPKredi;
                case 2:
                    alinanKredi += Dersler.matKredi;
                case 3:
                    alinanKredi += Dersler.gTKredi;
            }
            System.out.println("Alinan toplam kredi = " + alinanKredi);
            if (alinanKredi > ogr1.maxKredi) {
                System.out.println("Max kredi miktarini gectiniz yeniden giris yapin");
                break;
            }

            System.out.print("Ders secimine devam etmek istiyor musunuz? (E/H)");
            cevap = strOku.next();
        } while (cevap.equalsIgnoreCase("e"));
    }

    public static void kurallar() {
        System.out.println("***Ders secim kurallari***");
        System.out.println("3 tane ders almak zorunlu");
        System.out.println("Toplam 10 kredilik ders alinabilir");
    }
}
