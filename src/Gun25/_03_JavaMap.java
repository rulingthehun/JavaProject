package Gun25;

import java.util.HashMap;

public class _03_JavaMap {
    public static void main(String[] args) {
        // Bir kartvizit uygulamasini 2 kisi icin yapiniz

        HashMap<String, String> bKartVizit = new HashMap<>();
        bKartVizit.put("Isim", "Burak");
        bKartVizit.put("EMail", "rulingthehun@gmail.com");
        bKartVizit.put("Adres", "Turkey");
        bKartVizit.put("Tel", "05079994466");

        System.out.println("bKartVizit.get(Isim) = " + bKartVizit.get("Isim"));
        System.out.println("bKartVizit.get(Tel) = " + bKartVizit.get("Tel"));

        HashMap<String, String> gKartVizit = new HashMap<>();
        gKartVizit.put("Isim", "Mert Gunhan");
        gKartVizit.put("EMail", "wiredgunhan@gmail.com");
        gKartVizit.put("Adres", "Turkey");
        gKartVizit.put("Tel", "05556667788");

//        Kartvizitlerim diye bir defteri nasil tanimlarim?
//        Burak's vizit
//        Gunhan's vizit
        HashMap<String, HashMap<String, String>> Kartvizitlerim = new HashMap<>();
        Kartvizitlerim.put("Burak", bKartVizit);
        Kartvizitlerim.put("Gunhan", gKartVizit);

        //Burak'in teline nasil ulasirim?
        System.out.println("Kartvizitlerim.get(Burak).get(Tel) = " + Kartvizitlerim.get("Burak").get("Tel"));
    }
}