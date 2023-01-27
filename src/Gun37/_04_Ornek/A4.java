package Gun37._04_Ornek;

public class A4 implements IGosterir, IYazdirir{ //Hem karasal hem uydu
    @Override
    public void goster() {
        System.out.println("Gosterdi");
    }

    @Override
    public void yazdir() {
        System.out.println("Yazdirdi");
    }
}
