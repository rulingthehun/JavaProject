package Gun21;

import java.util.Scanner;

public class _03_JavaMethod {
    // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
    // yaptıktan sonra main de yazdırınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("1. sayiyi girin = ");
        int sayi1 = oku.nextInt();
        System.out.print("2. sayiyi girin = ");
        int sayi2 = oku.nextInt();
        int enb = enbBUl(sayi1, sayi2);
        System.out.println("enb = " + enb);
    }

    public static int enbBUl(int sayi1, int sayi2) {
        int enbBul = sayi1 > sayi2 ? sayi1 : sayi2;
        return enbBul;
    }
}