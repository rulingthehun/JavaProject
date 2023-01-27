package Gun10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir password girin = ");
        String pass = oku.nextLine();
        boolean varMi = pass.toLowerCase().contains("pass");
        if (pass.length() >= 8 && pass.length() <= 12 && !varMi) {
            System.out.println("Uygun password");
        } else {
            System.out.println("Uygun olmayan password");
        }
    }
}