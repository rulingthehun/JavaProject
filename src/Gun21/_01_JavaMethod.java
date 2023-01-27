package Gun21;

import java.util.Scanner;

public class _01_JavaMethod {
    // Kullanıcıya aşağıdaki gibi bir menü çıkartarak, kullanıcı çıkış seçeneğini seçene kadar
    // sürekli işlemleri yapınız ve her bir menü için gerekli değerleri parametre alan fonksiyon olarak yazınız.
        /*  1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
        Bir işlem seçiniz */
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Sayi1 = ");
        int sayi1 = oku.nextInt();
        System.out.print("Sayi2 = ");
        int sayi2 = oku.nextInt();
        islem(sayi1, sayi2);
    }

    public static void islem(int sayi1, int sayi2) {
        Scanner oku2 = new Scanner(System.in);
        System.out.print(
                "1 - Toplama\n" +
                        "2 - Cikarma\n" +
                        "3 - Carpma\n" +
                        "4 - Bolme\n" +
                        "5 - Cikis\n" +
                        "Seciminiz = ");
        int secim = oku2.nextInt();
        do {
            if (secim < 6 && secim > 0) {

                switch (secim) {
                    case 1:
                        int toplam = toplamBul(sayi1, sayi2);
                        System.out.println("toplam = " + toplam);
                        break;
                    case 2:
                        System.out.println("Cikarma = " + (sayi1 - sayi2));
                        break;
                    case 3:
                        System.out.println("Carpma = " + (sayi1 * sayi2));
                        break;
                    case 4:
                        System.out.println("Bolme = " + (sayi1 / sayi2));
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                }
            }
        } while (secim < 6 && secim > 0);
        System.out.println("Cikis yapildi");
    }

    public static int toplamBul(int s1, int s2) {
        return s1 + s2;
    }
}
// TODO : 4 işlem kısmınıda ayrı bir fonksiyonda yapalım
// TODO : menülere yeni bir seçenek olarak girilen sayıya kadar çarpımı veren faktöreli de ekleyelim