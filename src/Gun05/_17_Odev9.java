package Gun05;

import java.util.Scanner;

public class _17_Odev9 {
    // Bir float oluşturunuz. Konsola boyunuzu giriniz. Float'ı yazdırınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Boyunuzu girin=");
        Float boy= oku.nextFloat();
        System.out.println("Boyunuz = " + boy);
    }
}
/*
Cikti=
Boyunuzu girin=186
Boyunuz = 186.0
 */