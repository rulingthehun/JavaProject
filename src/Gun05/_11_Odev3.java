package Gun05;

import java.util.Scanner;

public class _11_Odev3 {
    public static void main(String[] args) {
        //Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın.O meyveyi yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Sevdiginiz bir meyveyi yazin=");
        String meyve = oku.next();
        System.out.println("Sevdiginiz meyve = " + meyve);
    }
}
/*
Cikti=
Sevdiginiz bir meyveyi yazin=Elma
Sevdiginiz meyve = Elma
 */