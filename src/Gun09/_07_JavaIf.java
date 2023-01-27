package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    // Girilen bir sayının birler ve onlar
    // basamağının eşit olup olmadığını yazdırınız.
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayi girin = ");
        int sayi= oku.nextInt();
        int birler=sayi%10;
        int onlar=sayi%100/10;
        if (birler==onlar)
        {
            System.out.print("Sayinin birler ve onlar basamagi esit");
        }
        if (birler!=onlar)
        {
            System.out.print("Sayinin birler ve onlar basamagi farkli");
        }
        // Yöntem: istediğin rakam sonda kalacak şekilde sayıyı böl.
        // sonra %10 yaparak son rakamı al.
    }
}
