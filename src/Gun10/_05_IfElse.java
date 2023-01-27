package Gun10;

import java.util.Scanner;

public class _05_IfElse {
    // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
    // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse
    // hayır yazdırınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir kelime girin = ");
        String kelime = oku.next();
        int uzunluk = kelime.length();
        if (uzunluk > 10 && kelime.toLowerCase().contains("study")) {
            System.out.println("Evet");
        } else {
            System.out.println("Hayir");
        }
    }
}
