package Gun05;

import java.util.Scanner;

public class _13_Odev5 {
    //Bir String oluştur. Konsol'a 10 sene önceki yaşadığın şehri yazın. Bu String'i yazdırın.
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        System.out.println("10 sene once hangi sahirde yasiyordunuz?");
        String sehir= oku.next();
        System.out.println("10 sene once yasadiginiz sehir = " + sehir);
    }
}
/*
Cikti=
10 sene once hangi sahirde yasiyordunuz?
Eskisehir
10 sene once yasadiginiz sehir = Eskisehir
 */