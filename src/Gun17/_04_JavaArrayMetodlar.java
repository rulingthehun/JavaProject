package Gun17;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _04_JavaArrayMetodlar {
    public static void main(String[] args) {
        //Array.toString/dizi
        String[] isimler= {"ahmet","melike","tugba","ege","mert"};
        System.out.println("Array.toString(isimler) = " + Arrays.toString(isimler));
        //[ahmet, melike, tugba, ege, mert]

        //Arrays.sort(isimler)
        Arrays.sort(isimler); //Siralama islemi yapildi
        System.out.println("Array.toString(isimler) = " + Arrays.toString(isimler));
//        [ahmet, ege, melike, mert, tugba]
        
        //Diziler esit mi?
        int[] a={1,8,3,54};
        int[] b={1,8,3,54};
        int[] c={1,8,2,54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); //true
        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,c)); //false
        
        //Arrays.fill-> butun kutucuklara atar
        Arrays.fill(c,7);
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c)); //[7, 7, 7, 7]

        //Arrays.binarySearch(rakamlar, 5)   -> Sıralı dizide aranan elemanın indexi verir
        // aranan elaman birden fazla ise herhangi birini verebilir.
        // esas amacı var mı yok mu kontrolü, var ise indexini verir, yok ise negatif sayı döndürür
        int[] rakamlar={2,7,4,6,5};
        System.out.println("Arrays.toString(rakamlar) = " + Arrays.toString(rakamlar)); //[2, 7, 4, 6, 5]
        Arrays.sort(rakamlar);
        System.out.println("Arrays.toString(rakamlar) = " + Arrays.toString(rakamlar)); //[2, 4, 5, 6, 7]
        System.out.println("Arrays.binarySearch(rakamlar, 7) = " + Arrays.binarySearch(rakamlar, 7)); //4
    }
}
