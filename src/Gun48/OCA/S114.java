package Gun48.OCA;

public class S114 {
    public static void main(String[] args) {
        int numbers[];
        numbers = new int[2];
        numbers [0] = 10;
        numbers [1] = 20;

        numbers = new int[4]; //Eski degerler ve eski uzunluk degisiyor, sifirlaniyor
        numbers [2] = 30;
        numbers [3] = 40;
        for (int x : numbers){
            System.out.print(" " + x);
        }
    }
//    Answer:
//    B. 0 0 30 40
}
