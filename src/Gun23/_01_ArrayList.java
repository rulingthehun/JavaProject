package Gun23;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemanı
        // Array i sıralarken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(50);
        rakamlar.add(5);
        rakamlar.add(456);
        rakamlar.add(45);
        rakamlar.add(3);

        System.out.println("rakamlar = " + rakamlar);

        //Siralama islemi
        Collections.sort(rakamlar);
        System.out.println("rakamlar = " + rakamlar);

        //Tersine cevirme
        Collections.reverse(rakamlar);
        System.out.println("rakamlar = " + rakamlar);

        //Max ve Min eleman bulma
        System.out.println("Collections.max(rakamlar) = " + Collections.max(rakamlar));
        System.out.println("Collections.min(rakamlar) = " + Collections.min(rakamlar));

        //Butun elemanlari set etme
        Collections.fill(rakamlar, 0);// butun elemanlara 0 atar
//        so

        //replace
        Collections.replaceAll(rakamlar, 0, 5); //0 lara 5 atadi
//        so

        //Tanimlarken deger atama
        int[] dizi = {2, 3, 4, 5};
        ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6));

        //diziyi direkt arrayListe atma

    }
}
