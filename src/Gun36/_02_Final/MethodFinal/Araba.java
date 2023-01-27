package Gun36._02_Final.MethodFinal;

public class Araba extends Vasita{
    private String renk;
    public Araba(String cinsi, String renk) {
        super(cinsi);
        setRenk(renk);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

//    @Override
//    public void vasitaOzelYazdir() {
//        System.out.println("renk = " + renk);
//        super.vasitaOzelYazdir();
//    }
//    final methodlar override edilemez, sadece kullanilir

    @Override
    public String toString() {
        return "Araba { " +
                "Cinsi = '" + getCinsi() + '\'' +
                ", Renk = '" + getRenk() + '\'' +
                " }";
    }
}
