package Gun32._04_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        PizzaSize small = PizzaSize.SmallPizza;
        PizzaSize medium = PizzaSize.MediumPizza;
        PizzaSize large = PizzaSize.LargePizza;
        ArrayList<PizzaSize> secilenPizzalar = new ArrayList<>();
        int sipSecim;
        do {
            System.out.println("1 - " + small + " - " + small.kisiSayisi + " Kisilik - " + "Pizza capi = " +
                    small.pizzaCapi + " cm - " + small.trBoy);
            System.out.println("2 - " + medium + " - " + medium.kisiSayisi + " Kisilik - " + "Pizza capi = " +
                    medium.pizzaCapi + " cm - " + medium.trBoy);
            System.out.println("3 - " + large + " - " + large.kisiSayisi + " Kisilik - " + "Pizza capi = " +
                    large.pizzaCapi + " cm - " + large.trBoy);
            System.out.println("4 - Secilen pizzalari yazdir");
            System.out.print("Pizza secimini yapin = ");
            int secim = oku.nextInt();
            switch (secim) {
                case 1:
                    secilenPizzalar.add(small);
                    break;
                case 2:
                    secilenPizzalar.add(medium);
                    break;
                case 3:
                    secilenPizzalar.add(large);
                    break;
                case 4:
                    System.out.println("Secilen pizzalar = " + secilenPizzalar);
                    siparisYaz(secilenPizzalar);
                    break;
            }
            System.out.print("Siparise devam etmek istiyor musunuz? 1)E 2)H -> ");
            sipSecim = oku.nextInt();
        } while (sipSecim == 1);
        System.out.println("Siparisiniz basariyla olusturuldu \n Siparis ozeti = " +
                secilenPizzalar);
        siparisYaz(secilenPizzalar);
    }

    public static void siparisYaz(ArrayList<PizzaSize> secilenPizzalar) {
        int s = 0; int m = 0; int l = 0;
        for (PizzaSize p : secilenPizzalar) {
            if (p == PizzaSize.SmallPizza) s++;
            if (p == PizzaSize.MediumPizza) m++;
            if (p == PizzaSize.LargePizza) l++;
        }
        System.out.println("Small pizza count = " + s);
        System.out.println("Medium pizza count = " + m);
        System.out.println("Large pizza count = " + l);
    }
}
