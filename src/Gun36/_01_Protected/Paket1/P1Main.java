package Gun36._01_Protected.Paket1;

public class P1Main {
    public static void main(String[] args) {
        P1Hayvan h = new P1Hayvan();
        h.ad = "Karakedi";
        h.yas = 2;
        h.cinsi = "Tekir";
//        h.renk -> private oldugu icin erisilemiyor
    }
}
