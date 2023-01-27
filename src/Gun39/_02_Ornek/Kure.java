package Gun39._02_Ornek;

import Utility.MyFunc;

public class Kure extends Sekil{

    protected double yariCap;

    public Kure(String name, double yariCap) {
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
        return 4 * Math.PI * Math.pow(yariCap, 2);
    }

    @Override
    public double cevre() {
        return 0;
    }

    public double hacim(){
        return 4 * Math.PI * Math.pow(yariCap, 3) / 3;
    }

    @Override
    public String toString() {
        return "\n Sekil adi = " + getName() +
                "\n Yuzey Alani = " + MyFunc.yuvarla(alan()) + " Metre kare" +
                "\n Hacim = " + MyFunc.yuvarla(hacim()) + " Metre kup";
    }
}
