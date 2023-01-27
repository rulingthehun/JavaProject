package Gun41._01_Ornek;

import Gun32._04_Ornek.PizzaSize;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        ArrayList<IFood> Siparis = new ArrayList<>();
        Adana_Kebap aK = new Adana_Kebap();
        IFood lH = new Lahmacun();
        Borsh b = new Borsh();
        Palov p = new Palov();

        int secim;
        do {
            menu();
            secim = oku.nextInt();
            switch (secim) {
                case 1:
//                    Adana_Kebap aK = new Adana_Kebap();
                    Siparis.add(aK);
                    break;
                case 2:
//                    IFood lH = new Lahmacun();
                    //IFood interface inden turetilen lahmacun
                    Siparis.add(lH);
                    break;
                case 3:
//                    Borsh b = new Borsh();
                    Siparis.add(b);
                    break;
                case 4:
//                    Palov p = new Palov();
                    Siparis.add(p);
                    break;
            }
        } while (secim < 5);
        System.out.println("Alinan siparisler:");

        for (IFood f :
                Siparis) {
            System.out.println(f.getClass().getSimpleName());
        }
        System.out.println("Siparis hazirlaniyor!");
        double toplamUcret = 0;
        for (IFood f :
                Siparis) {
            TechnoKitchen.hazirla(f);
            toplamUcret += f.ucret();
        }
        System.out.println("Siparis ucreti = " + toplamUcret + "₺");
    }

    static void menu() {
        System.out.print("<--*******  Menü  *******-->\n" +
                "1-Adana Kebap (50 TL)\n" +
                "2-Lahmacun (30 TL)\n" +
                "3-Borsh (20 TL)\n" +
                "4-Palov (20 TL)\n" +
                "5-Tamam \n" +
                "Seciminiz = ");
    }
}
