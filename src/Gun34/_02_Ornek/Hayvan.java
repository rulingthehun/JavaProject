package Gun34._02_Ornek;

public class Hayvan { //base class, parent class
    private String renk;
    private int kilo;
    private String cinsi;

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    public Hayvan(String renk, int kilo, String cinsi) {
        setRenk(renk);
        setKilo(kilo);
        setCinsi(cinsi);
    }

    public void konustu() {
        System.out.println("Hayvan ses cikardi");
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "renk='" + renk + '\'' +
                ", kilo=" + kilo +
                ", cinsi='" + cinsi + '\'' +
                '}';
    }
}
