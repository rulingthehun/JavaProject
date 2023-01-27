package Gun16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        int sayi = 0;
        int[] dizi = new int[5]; //0,1,2,3,4 index olarak 5 sayilik yer acar

        dizi[0] = 5;
        dizi[1] = 56;
        //dizi[5]=45; //Bu olmaz, Challenger patlar
        System.out.println("dizi.length = " + dizi.length); //bu bana kac eleman oldugunu verir

        Scanner oku = new Scanner(System.in);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayi girin = ");
            dizi[i] = oku.nextInt();
        }
        System.out.println("dizi = " + dizi[4]);

        for (int i = 0; i < dizi.length; i++)
            System.out.println(dizi[i]);
    }
}
