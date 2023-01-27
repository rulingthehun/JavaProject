package Gun49.OCA;

import java.util.ArrayList;
import java.util.List;

public class S48_ArrayList {
    public static void main(String[] args) {
        List colors = new ArrayList();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.remove(2);
        colors.add(3, "cyan");
//        Son siraya denk gelen indexe eklenebilir
//        Ondan buyuk indexe eklenemez hata verir
        System.out.println(colors);
    }
//    Answer:
//    B. [green, blue, yellow, cyan]
}
