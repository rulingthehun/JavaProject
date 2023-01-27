package Gun05;

import java.util.Scanner;

public class _15_Odev7 {
    //Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
    //   Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Bir banka hesabiniz var mi? Hesabiniz varsa true, yoksa false olarak cevap verin.");
        Boolean banka= oku.nextBoolean();
        System.out.println("Banka hesabiniz " + banka);
    }
}
/*
Cikti=
Bir banka hesabiniz var mi? Hesabiniz varsa true, yoksa false olarak cevap verin.
true
Banka hesabiniz true
 */