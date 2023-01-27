package Gun22;

import java.util.ArrayList;

public class _01_ArrayList_ {
    public static void main(String[] args) {
        //dizi, array : Boyut sayisi belli ve sonradan noyutu degistirilemez.
        int[] dizi = new int[5]; //Array 5 elemanli, boyutu sonradan degismiyor.
        // Boyutu dinamik olsa, eleman ekledikce uzasa, sildikce kisalsa
        //ArrayList : Boyutu basta vermene gerek yok, boyutu 0 baslar
        // eleman ekledikce artar, sildikce azalir.
        ArrayList<Integer> integerList = new ArrayList<>(); //tanimlama
        ArrayList<Boolean> booleanList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();

        Integer s1 = 5; //hem  sayi hem de icinde fonksiyonlar sakliyor. defualt null
        int s2 = 6; //bu hafizada sadece rakam saklayabilen bir degisken. Ilkel tip, primitive tip defualt 0

        ArrayList<String> isimler = new ArrayList<>();
        System.out.println("isimler = " + isimler); // hizli yazdirma

        isimler.add("Tugba"); //Dizi uzunlugu 1
        isimler.add("Gunhan"); //Dizi uzunlugu 2
        isimler.add("Yigitcan"); //Dizi uzunlugu 3
        isimler.add("Can");

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());

        isimler.add(1, "Turgut"); // verilen indexe ekliyor
        System.out.println("isimler = " + isimler);

        isimler.set(1, "Tancan");
        System.out.println("isimler = " + isimler);

        isimler.remove("Tancan");
        System.out.println("isimler = " + isimler);

        isimler.remove(0);
        System.out.println("isimler = " + isimler);

        int indexOfCan = isimler.indexOf("Can");
        System.out.println("indexOfCan = " + indexOfCan);

        for (int i = 0; i < isimler.size(); i++)
            if (isimler.get(i).equalsIgnoreCase("can"))
                isimler.remove(i);
        String ilkEleman = isimler.get(0); //O indexdeki elemani alma

        isimler.clear(); //tum list bosaltildi
        System.out.println("isimler = " + isimler);
    }
}
