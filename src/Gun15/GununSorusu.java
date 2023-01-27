package Gun15;

public class GununSorusu {
    // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
    //    *        1.Satırda 4 bosluk 1 yıldız
    //   **    2.satırda 3 bosluk 2 yıldız
    //  ***     3.satırda 2 bosluk 3 yıldız
    // **** 4.satırda 1 bosluk 4 yıldız
    // *****    5.satırda 5 yıldız

//    Sayinin simetrik oldugunu nasil anlarsin?
//    sayinin tersi kendisiyle ayni ise, 121 -> 121
//    sayinin sondaki basamagini alacaksin ve onu yeni basamak geldikce 10 ile carpip
//    yeni basamakla toplayacaksin.
//        12521 -> 1 -> 1*10+2 -> 12*10+5 -> 125*10+2 -> 1252*10+1 -> 12521

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            //bosluklar burada olmali
            for (int j = 0; j < 5 - i; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
