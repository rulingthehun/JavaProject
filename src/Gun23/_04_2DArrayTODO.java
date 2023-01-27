package Gun23;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_2DArrayTODO {
    //    Kullanıcıdan alınan ders notuna göre ekrana Notların Listesini bir fonksiyonda yazdırınız
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

        Scanner oku = new Scanner(System.in);
        System.out.println("0-Mat, 1-Fiz, 2-Kim");
        System.out.print("Ders no = ");
        int dersNo = oku.nextInt();

        dersNotlariniYazdir(dersNo, notlarListesi);
    }

    public static void dersNotlariniYazdir(int dersNo, ArrayList<ArrayList<Integer>> notlarListesi) {
        //ders no belliyse 2 tane for dongusune ihtiyacim yok
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            System.out.println("notlarListesi = " + notlarListesi.get(dersNo).get(i));
        }
    }
}