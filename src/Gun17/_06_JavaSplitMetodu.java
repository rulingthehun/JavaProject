package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _06_JavaSplitMetodu {
    public static void main(String[] args) {
        //Kullanıcın gireceği 02/11/2022 şeklindeki tarih bilgisini
        // gün ay yıl olarak yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Tarih girin = ");
        String tarih = oku.nextLine();
        String[] tarih2=tarih.split("[/,.,-]");
        System.out.println("Tarih = "+ Arrays.toString(tarih2));
        System.out.println("Gun = "+tarih2[0]);
        System.out.println("Ay = "+tarih2[1]);
        System.out.println("Yil = "+tarih2[2]);
    }
}
