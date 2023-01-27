package Gun35._02_02_Ornek;

public class Daire extends Sekil{
    private double yaricap;

    @Override
    public double alan() {
        return Math.PI * Math.pow(getYaricap(), 2);
    }

    @Override
    public double cevre() {
        return 2 * Math.PI * getYaricap();
    }

    public Daire(double yaricap) {
        setYaricap(yaricap);
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public String toString() {
        return "Daire -> " + "Yari cap = "
                + getYaricap() + " cm";
    }
}
