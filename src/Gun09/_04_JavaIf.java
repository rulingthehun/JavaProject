package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayının tek mi çift mi olduğunu yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayi girin = ");
        int sayi= oku.nextInt();
        int sonuc=sayi%2;
        if (sonuc==0)
        {
            System.out.print("Sayi cift");
        }
        if (sonuc!=0)
        {
            System.out.print("Sayi tek");
        }
    }
}
