package Gun35._02_02_Ornek;

public class Dikdortgen extends Sekil{
    private double kisaKenar;
    private double uzunKenar;

    public Dikdortgen
            (double kisaKenar, double uzunKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
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
    public double alan() {
        return getKisaKenar() * getUzunKenar();
    }

    @Override
    public double cevre() {
        return (getKisaKenar() * 2)
                + (getUzunKenar() * 2);
    }

    @Override
    public String toString() {
        return "Dikdortgen -> Kisa kenar = " +
                getKisaKenar() + " cm Uzun kenar = "
                + getUzunKenar() + " cm";
    }
}
