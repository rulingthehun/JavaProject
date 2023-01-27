package Gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        //Baklava dilimi = if
        //Girilen bir sayi 10'dan ise ekrana 10'dan buyuk yazdir.
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi girin = ");
        int sayi= oku.nextInt();
        if (sayi>10)
        {
            System.out.println("Sayi 10'dan buyuk");
        }
    }
}