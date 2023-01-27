package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {
        int     sayi=   5;
        //tipi  adi   degeri; islem tamam
        Scanner okuyucu=new Scanner(System.in);
        //tipi   adi    yeni bir okuyucu (klavyeden - konsoldan)
        System.out.print("Sayi giriniz=");
        sayi=okuyucu.nextInt();
        //okuyucu.nextInt() -> ekrandan 1 tam sayi (int cinsinden) oku
        System.out.println("sayi = " + sayi);
    }
}
