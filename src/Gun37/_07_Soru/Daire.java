package Gun37._07_Soru;

public class Daire implements ISekil{
    @Override
    public double cevre(double... dizi) {
        return dizi[0] * 2 * Math.PI;
    }

    @Override
    public double alan(double... dizi) {
        return dizi[0] * dizi[0] * Math.PI;
    }
}
