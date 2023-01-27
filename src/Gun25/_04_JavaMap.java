package Gun25;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _04_JavaMap {
    public static void main(String[] args) {
//        HashMap<Integer, String> hm = new HashMap<>();
        Map<Integer, String> hm = new HashMap<>();
        hm.put(9, "kopek");
        hm.put(2, "kedi");
        hm.put(44, "bear");
        hm.put(77, "bird");
        System.out.println("hm = " + hm);

        Map<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(9, "kopek");
        lhm.put(2, "kedi");
        lhm.put(44, "bear");
        lhm.put(77, "bird");
        System.out.println("lhm = " + lhm);

        Map<Integer, String> tm = new TreeMap<>();
        tm.put(9, "kopek");
        tm.put(2, "kedi");
        tm.put(44, "bear");
        tm.put(77, "bird");
        System.out.println("tm = " + tm);

    }
}
