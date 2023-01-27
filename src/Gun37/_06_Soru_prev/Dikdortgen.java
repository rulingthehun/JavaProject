package Gun37._06_Soru_prev;

public class Dikdortgen implements ISekil {

    @Override
    public double cevre(double kisaKenar, double uzunKenar) {
        return (kisaKenar + uzunKenar) * 2;
    }

    @Override
    public double alan(double kisaKenar, double uzunKenar) {
        return kisaKenar * uzunKenar;
    }

}
