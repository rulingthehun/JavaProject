package Gun37._07_Soru;

public class Dikdortgen implements ISekil {

    @Override
    public double cevre(double... dizi) {
        return (dizi[0] + dizi[1]) * 2;
    }


    @Override
    public double alan(double... dizi) {
        return dizi[0] * dizi[1];
    }

}
