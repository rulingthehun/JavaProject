package Gun25;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1001, "Ismet Temur");
        hm.put(1002, "Burak");
        hm.put(2001, "Mert Gunhan");
        hm.put(5001, "Can Sungur");
        hm.put(2002, "Yigitcan"); //2001 de ki bilgiyi guncelliyor

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        for (Integer k :
                hm.keySet()) {
            System.out.println("k = " + k);
        }

        for (String v :
                hm.values()) {
            System.out.println("v = " + v);
        }
        // Entry -> girilen (veri), EntrySet -> girilenlerin seti, veriler
        for (Map.Entry<Integer, String> kv :
                hm.entrySet()) {
            System.out.println("kv.getKey() = " + kv.getKey());
            System.out.println("kv.getValue() = " + kv.getValue());
        }
        for (Map.Entry<Integer, String> kv :
                hm.entrySet()) {
            System.out.println("Anahtar ve deger = " + kv.getKey() + "-" + kv.getValue());
        }
    }
}
