package Gun39._02_Ornek;

public class Daire extends Sekil{

    private double yariCap;

    public Daire(String name, double yariCap) {
        super(name);
        setYariCap(yariCap);
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    public double alan() {
        return Math.PI * Math.pow(getYariCap(), 2);
    }

    @Override
    public double cevre() {
        return 2 * Math.PI * getYariCap();
    }
}
