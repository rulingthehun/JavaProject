package Gun06;

import java.util.Scanner;

public class _13_Soru {
    public static void main(String[] args) {
        //Girilen bir string'de bosluk olup olmadigini bul.
        System.out.println("Kelime(ler) girin= ");
        Scanner oku=new Scanner(System.in);
        String kelimeler= oku.nextLine();
        System.out.println("varMi= "+kelimeler.contains(" "));
    }
}
