package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    // Girilen bir öğrencinin notuna göre 50 den büyük-eşit ise geçtiniz,
    // küçük ise kaldınız yazdırınız.
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Ogrencinin notunu girin = ");
        int not= oku.nextInt();
        if (not>=50)
        {
            System.out.print("Gectiniz");
        }
        if (not<50)
        {
            System.out.print("Tebrikler yaz okulu kazandiniz");
        }
    }
}
