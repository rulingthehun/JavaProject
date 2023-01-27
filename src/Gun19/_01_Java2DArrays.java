package Gun19;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int sayi = 0; //1 tane sayi tutar
        int[] ders1Notlari = new int[40]; //40 tane sayi saklar
        int[] ders2Notlari = new int[40];
        int[] ders3Notlari = new int[40]; //index 0-39

        int[][] tumDersNOtlari = new int[3][40];//3 ders 40 ogrenci

        ders1Notlari[0] = 80; //tek boyutlu dizide ilk elemana 80 atandi
        tumDersNOtlari[0][0] = 80; //2 boyutlu dizide ilk satirin ilk sutununa 80 atandi

        System.out.println("tumDersNOtlari = " + tumDersNOtlari[0][0]);
        Scanner oku = new Scanner(System.in);
        tumDersNOtlari[0][0] = oku.nextInt();
    }
}