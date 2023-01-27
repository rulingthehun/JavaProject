package Gun25;

import java.util.Scanner;
import java.util.TreeMap;

public class _05_JavaMap {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secenekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış


    }
    // 1- Ekleme
    public static void sozluk() {
        Scanner oku = new Scanner(System.in);
        TreeMap<String, String> sozluk = new TreeMap<>();
        System.out.print("Sozluge eklenecek kelime = ");
        String kelime = oku.next();
        System.out.print("Kelimenin anlami = ");
        String anlam = oku.nextLine();
        String cevap = new String();
        do {
            sozluk.put(kelime, anlam);
            System.out.print("Kelime eklemeye devam etmek istiyor musunuz? (E/H)");
            cevap = oku.next();
        } while (cevap.equalsIgnoreCase("e"));
    }

}
//    // 1- Ekleme
//    TreeMap<String, String> sozluk = new TreeMap<>();
//        sozluk.put("Assert", "İleri Sürmek, İddia Etmek");
//                sozluk.put("Attitude", "Tavır, Tutum");
//                sozluk.put("Business", "");
//                sozluk.put("Cabbage", "Lahana");
//                sozluk.put("Commitment", "Vaat, Taahhüt");
//                sozluk.put("Destitute", "Muhtaç, yoksul");
//                // 2- Düzeltme
//                sozluk.put("Business", "Iş");