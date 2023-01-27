package Gun17;

import java.util.Arrays;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
        //Split: Bir stringi verilen kritere gore parcalara ayirir
        String cumle="Bugun hava odukca soguk";
//        0. kelime = Bugun
//        1. kelime = hava
//        2. kelime = odukca
//        3. kelime = soguk
        String[] kelimeler=cumle.split(" ");

        for (int i = 0; i< kelimeler.length;i++)
            System.out.println(i+". kelime = "+kelimeler[i]);

        //Kisa yazdirma yolu
        System.out.println("kelimeler = "+ Arrays.toString(kelimeler));
    }
}
