package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Vize notunu girin = ");
        int vize = oku.nextInt();
        System.out.print("Final notunu girin = ");
        int finalNotu = oku.nextInt();
        double ortalama= (vize*0.4) + (finalNotu*0.6);
        if (ortalama>=60){
            System.out.print("Tebrikler gectiniz "+ortalama);
        }
        else {
            System.out.print("Butunlemeye kaldiniz "+ortalama);
        }
    }
}
