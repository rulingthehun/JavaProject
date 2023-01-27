package Gun36._02_Final.MethodFinal;

public class Vasita {
    private String cinsi;

    public Vasita(String cinsi) {
        setCinsi(cinsi);
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }
    public final void vasitaOzelYazdir(){
        System.out.println("Ozel yazdirma methodu");
        System.out.println("Cinsi = " + getCinsi());
    }
    @Override
    public String toString() {
        return "Vasita { " +
                "Cinsi = '" + getCinsi() + '\'' +
                " }";
    }
}
