package Gun24;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler = new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");

        //ekrana yazdirma
        System.out.println("renkler = " + renkler);

        //ekrana yazdirma tek tek
        for (String eleman :
                renkler) {
            System.out.println("eleman = " + eleman);
        }

        //icindeki siranin garanti edildigi yontem
        Iterator gosterge = renkler.iterator(); // hafizadaki ilk kutucugun yerini aldim,
        //ben adim adim gidecegim, boylece icindeki sirayi takip edecegim.

        //adim adim gitme, bir sonraki bir sonraki
        while (gosterge.hasNext()) { //bir sonraki var mi?
            System.out.println("gosterge.next() = " + gosterge.next()); // o kutuyu yaz.
            //if gosterge.remove(); o an ki kutuyu siler
        }

    }
}
