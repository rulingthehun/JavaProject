package Gun17;

public class _03_JavaArray {
    public static void main(String[] args) {
        // 100 Elemanlı bir diziyi random olarak 100 e kadar olan sayılarla doldurunuz.
        // Sonrasında tek ve çift eleman sayılarını bulunuz.
        int[] dizi=new int[100];
        for (int i = 0; i< dizi.length; i++)
            dizi[i]=(int) (Math.random()*100);
        int tekSayac=0;
        int ciftSayac=0;
        for (int j =0; j< dizi.length; j++){
            if (dizi[j]%2==1)
                tekSayac++;
            else
                ciftSayac++;
        }
        System.out.println(ciftSayac+" adet cift sayi var");
        System.out.println(tekSayac+" adet tek sayi var");
    }
}
