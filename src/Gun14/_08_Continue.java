package Gun14;

import java.util.Scanner;

public class _08_Continue {
    // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
    // şekilde yazdırınız, boşlukları yazmasın.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir kelime girin = ");
        String cumle = oku.nextLine();
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ') continue;
            System.out.println(cumle.charAt(i));
        }
    }
}
