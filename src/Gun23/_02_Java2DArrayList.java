package Gun23;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        /*
        int sayi=5;   // tek bir rakam tutabilen değişken
        int[] dizi=new int[20];  // 20 adet sayi tutabilen değişken, uzunluk sabit
        int[][] tablo=new int[20][2];  // 20x2 lik sayı saklayabilen değişken, uzunluk sabit

        ArrayList<Integer> liste=new ArrayList<>(); // istenildiği kadar sayı eklenebilen değişken, uzunluk değişken
        */
        // 3 ogrencinin ders notlarini bir degiskende nasil birlestiriz
        ArrayList<Integer> matNotlari = new ArrayList<>(); // tek bir dersin notlari
        ArrayList<Integer> fizNotlari = new ArrayList<>(); // tek bir dersin notlari
        ArrayList<Integer> kimNotlari = new ArrayList<>(); // tek bir dersin notlari

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        //ArrayList in ArrayListi nasil yapilir
        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);
        //butun ders notlari notlar listesinde su anda yani ArrayListlerin listesi

        notlarListesi.get(0); //matNotlarin her bir elemani
        int matBirNot = notlarListesi.get(0).get(0); //0. listenin 0. elemani

        System.out.println("notlarListesi = " + notlarListesi.get(0)); //0. liste
        System.out.println("notlarListesi = " + notlarListesi.get(1)); //1. liste
        System.out.println("notlarListesi = " + notlarListesi.get(2)); //2. liste

        //dongu seklinde yazdirma
        for (int i = 0; i < notlarListesi.size(); i++)
            System.out.println("notlarListesi = " + notlarListesi.get(i));

        for (int i = 0; i < notlarListesi.size(); i++) {
            for (int j = 0; j < notlarListesi.get(i).size(); j++)
                System.out.print(notlarListesi.get(i).get(j) + "\t");
            System.out.println();
        }
    }
}