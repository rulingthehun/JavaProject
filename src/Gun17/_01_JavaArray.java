package Gun17;

public class _01_JavaArray {
    // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
    // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1, çift olanlara 2 atayınız  yazdırınız.
    public static void main(String[] args) {
        int[] dizi = new int[50]; //50 elemanlı bir dizi tanımlayınız
        for (int i = 0; i < dizi.length; i++) //0-49 arasi
            dizi[i] = (int) (Math.random() * 10); //10 a kadar olan sayılardan Random atayarak
        // doldurunuz.
        for (int i = 0; i < dizi.length; i++)//kontrol icin yazdirdik
            System.out.println(i + ".dizi = " + dizi[i]);

        for (int j = 0; j < dizi.length; j++) { //Sonrasında ayrı bir döngü ile
            if (dizi[j] % 2 == 1)
                dizi[j] = 1; //tek olanlar 1
            else
                dizi[j] = 2; //çift olanlara 2
        }

        System.out.println("************");
        for (int i = 0; i < dizi.length; i++)//kontrol icin yazdirdik
            System.out.println(i + ".dizi = " + dizi[i]);
    }
}