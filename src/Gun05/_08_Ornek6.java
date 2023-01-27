package Gun05;

import java.util.Scanner;

public class _08_Ornek6 {
    // Kullanıcıdan ağırlığını double, boyunu int olarak alınız.
    // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
    // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Vucut agirliginizi girin=");
        double kilo= oku.nextDouble();
        System.out.print("Boyunuzu girin=");
        int boy= oku.nextInt();
        System.out.println("Boyunuz = " + boy +" "+ "Kilonuz = " + kilo);
        double kitleIndex=kilo/(boy*boy);
        System.out.println("kitleIndex = " + kitleIndex);
    }
}
