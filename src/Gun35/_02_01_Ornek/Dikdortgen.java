package Gun35._02_01_Ornek;

public class Dikdortgen {
    private double kisaKenar;
    private double uzunKenar;

    public Dikdortgen(double kisaKenar, double uzunKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    public double dikdortgenCevre() {
        return (getKisaKenar() * 2) + (getUzunKenar() * 2);
    }

    public double dikdortgenAlan() {
        return getKisaKenar() * getUzunKenar();
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    @Override
    public String toString() {
        return "Dikdortgen { " +
                "Kisa Kenar = " + getKisaKenar() +
                " cm, Uzun Kenar = " + uzunKenar +
                " cm }";
    }
}
