package Gun49.OCA;

import java.util.ArrayList;

public class S155_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null); //Tip Integer oldugunda Nesne Tipleri null olabiliyor
        points.remove(1); //Sadece rakam verilirse index kabul eder ve o indexi siler
        points.remove(null); //Object yani deger verilirse, o degeri siler
//        points.remove((Object)1); int sayiyi listeden silmek icin index olmadigini,
//                                  Object oldugunu belirtmek gerekir
        System.out.println(points);
    }
//    Answer:
//    E. [1, 3, 4]
}
