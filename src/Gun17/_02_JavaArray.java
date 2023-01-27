package Gun17;

public class _02_JavaArray {
    public static void main(String[] args) {
        // 100 Elemanlı bir diziyi random olarak 100 e kadar olan sayılarla doldurunuz.
        // Sonrasında en büyük elemanı ve indexini bulunuz.
        int[] dizi = new int[100]; //100 Elemanlı bir dizi

        //random olarak 100 e kadar olan sayılarla doldurunuz
        for (int i = 0; i < dizi.length; i++)
            dizi[i] = (int) (Math.random() * 100);
        int enBuyuk = 0;
        int enbIndex = 0;
        for (int j = 0; j < dizi.length; j++)
            if (dizi[j] > enBuyuk) {
                enBuyuk = dizi[j];
                enbIndex=j;
            }
        System.out.println(enbIndex + ". sayi en buyuk = " + enBuyuk);
    }
}