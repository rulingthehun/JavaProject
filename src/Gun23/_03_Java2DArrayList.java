package Gun23;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_Java2DArrayList {
    //Notlari ekrana  ders adlarini bir arrayListten alarak her dersin adini ve notlarini
    //her bir satira yazdirin
    // Matematik: 40 50 60
    // Fizik: 30 40
    // Kimya: 70 80 90 100
    public static void main(String[] args) {
        ArrayList<Integer> matNotlar = new ArrayList<>();
        ArrayList<Integer> fizNotlar = new ArrayList<>();
        ArrayList<Integer> kimNotlar = new ArrayList<>();

        matNotlar.add(40);
        matNotlar.add(50);
        matNotlar.add(60);

        fizNotlar.add(30);
        fizNotlar.add(40);

        kimNotlar.add(70);
        kimNotlar.add(80);
        kimNotlar.add(90);
        kimNotlar.add(100);

        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();
        notlarListesi.add(matNotlar);
        notlarListesi.add(fizNotlar);
        notlarListesi.add(kimNotlar);

        ArrayList<String> dersAdlari = new ArrayList<>();
        dersAdlari.add("Matematik");
        dersAdlari.add("Fizik");
        dersAdlari.add("Kimya");

        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println(dersAdlari.get(i) + " : ");
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.println(notlarListesi.get(i).get(j) + "\t");
            }
            System.out.println();
        }
        // TODO :  Soru 1 :Kullanıcıdan alınan ders notuna göre ekrana Notların Listesini bir fonksiyonda yazdırınız
        //         Soru 2 :Yukarıda Girilen Derse ait ortalamayı main de yazdırınız.
        //         Soru 3 :Tüm Derslerin Not yani tum notların ortalamasını(double) bir fonksiyonda buldurup mainde yazdırınız.
        //         Soru 4 :En büyük ve en küçük notu bir maın ıcınde bulunuz (fonksiyon zorunlu değil)
    }
}
