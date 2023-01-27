package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_ArrayList_Soru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        ArrayList<Integer> ogrNotlar = new ArrayList<>();
        String cevap;
        int toplam = 0;
        do {
            System.out.print("Ogrenci notunu girin = ");
            int ogrNot = okuInt.nextInt();
            ogrNotlar.add(ogrNot);
            toplam += ogrNot;
            System.out.print("Devam etmek istiyor musunuz? (E/H) ");
            cevap = okuStr.next();
        } while (cevap.equalsIgnoreCase("e"));
        System.out.println("ogrNotlar = " + ogrNotlar);

        int ort = toplam / ogrNotlar.size();
        System.out.println("ort = " + ort);

        int gecenOgr = 0;
        for (int i = 0; i < ogrNotlar.size(); i++)
            if (ogrNotlar.get(i) > ort)
                gecenOgr++;
        System.out.println("gecenOgr = " + gecenOgr);

        //TODO : Tek elemanlarini ayri diziye bir metodda atayarak main de yazdiriniz.
    }
}
