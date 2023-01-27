package Gun25;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
//        Set -> HashSet, LinkedHashSet, TreeSet
//        Map -> HashMap, LinkedHashMap, TreeMap

//        anahtarimin tipi Integer, degerlerimin tipi String olacak
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1001, "Ismet Temur");
        hm.put(1002, "Burak");
        hm.put(2001, "Mert Gunhan");
        hm.put(5001, "Can Sungur");
        hm.put(2001, "Yigitcan"); //2001 de ki bilgiyi guncelliyor

        System.out.println("hm = " + hm);
        System.out.println("hm.get(1002) = " + hm.get(1002));
        System.out.println("hm.get(2001) = " + hm.get(2001));
        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        hm.remove(2001); //2001 anahtarinda ki eleman silindi.
        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size());

        hm.clear();
        System.out.println("hm = " + hm);
    }
}
