package Gun08;

import java.util.Scanner;

public class _07_Soru {
    // kullanıcının gireceği 2 sayının birbirine
    // eşit olup olmadığını yazdırınız
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("2 sayi girin = ");
        int sayi1= oku.nextInt();
        int sayi2= oku.nextInt();
        System.out.println("sayi 1 sayi 2'ye esit mi? "+ (sayi1==sayi2));
    }
}
