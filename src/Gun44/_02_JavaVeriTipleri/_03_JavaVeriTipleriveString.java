package Gun44._02_JavaVeriTipleri;

public class _03_JavaVeriTipleriveString {
    public static void main(String[] args) {
        int sayi1 = 5; //short, byte, long, float, char, boolean: Primitive tipler

        int sayi2 = 10;

        sayi1 = sayi2; // sayi1 = 10, sayi2 = 10
        sayi1 = 34;
        sayi2 = 45;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
//        Bunlar hafizada farkli yerlere sahipler

        int[] dizi1 = {1, 2, 3} /*Bu degerler silindi*/;
//        Dizi: Referance tip
//        Ilkel tip degil
        int[] dizi2 = {5, 6};

        dizi1 = dizi2;
        dizi1[0] = 67;
        System.out.println("dizi1[0] = " + dizi1[0]);
        System.out.println("dizi2[0] = " + dizi2[0]);
//        Dizilerin sadece o an ki degerleri degil, diziler hafizada ayni dizi olarak esitlendi

//        Nesne tipleri
//        String, Integer, Double, Long
        int sayi = 5;
        Integer rakam = 5;
//        rakam./*toString().concat().contains().equals().byteValue()*/
//        Integer'in kendine ait methodlari var, primitive tip degil
        String kelime = "Merhaba";
//        Null deger alabilen ilkel tipler
//        Referans'a yakin, ilkel gibi davranir

        String ad1 = "Mehmet";
        String ad2 = "Ali";
        ad1 = ad2;

        ad2 = "Ayse";
        System.out.println("ad1 = " + ad1); //Ali
        System.out.println("ad2 = " + ad2); //Ayse
//        Primitive tipler gibi degiskenler birine esitlenmez, sadece o an ki degerleri esitlenir
//        Her zaman RAM'de 2 ayri degisken olarak kalir
//        Primitive tipler ise esitlendikten sonra RAM'de tek degisken olarak saklanir


    }
}
