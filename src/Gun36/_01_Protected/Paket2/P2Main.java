package Gun36._01_Protected.Paket2;

import Gun36._01_Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan h = new P1Hayvan();
        h.ad = "Alfred";
//        h.yas -> defualt - sadece kendi paketi
//        h.cinsi -> protected - defualt gibi
//        h.renk -> private - sadece kendi classi
        Kedi k = new Kedi("Lazer", "Tekir");
        System.out.println(k);
        Kedi cute = new Kedi("Garfield", "Scotihs");
        System.out.println(cute);
    }
}
