package Gun05;

import java.util.Scanner;

public class _12_Odev4 {
    //Bir int oluştur. Konsol'a arabanızdaki kapı sayısını girin. Bu int'i yazdırın.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Arabanizdaki kapi sayisini giriniz=");
        int kapi = oku.nextInt();
        System.out.println("Arabanizdaki kapi sayisi = " + kapi);
    }
}
/*
Cikti=
Arabanizdaki kapi sayisini giriniz=5
Arabanizdaki kapi sayisi = 5
 */