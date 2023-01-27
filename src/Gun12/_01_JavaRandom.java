package Gun12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Min = ");
        int min = oku.nextInt();
        System.out.print("Max = ");
        int max = oku.nextInt();
        int belirli_Aralikta_Uretilen_Sayi = (int) (Math.random() * (max - min)) + min;
        System.out.println("belirli_Aralikta_Uretilen_Sayi = " + belirli_Aralikta_Uretilen_Sayi);
    }
}
