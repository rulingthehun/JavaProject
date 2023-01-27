package Gun24;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        //SETS
        //HashSet: Hizli, bunun icin kendine ozel sirada saklar.
        //LinkedHashSet: Eklendigi sirada saklar
        //TreeSet: Her zaman sirali tutar, kendinden sortlu

        //Hizli calismak icin kendine ozel bir sirada saklar
        HashSet<String> hs = new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("uc");
        hs.add("dort");
        hs.add("bes");
        System.out.println("hs = " + hs);

        //Ekleme sirasina gore elemanlari saklar
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("uc");
        lhs.add("dort");
        lhs.add("bes");
        System.out.println("lhs = " + lhs);

        //her zaman sirali tutar, kendinen sortlu
        TreeSet<String> ts = new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("uc");
        ts.add("dort");
        ts.add("bes");
        System.out.println("ts = " + ts);
    }
}
