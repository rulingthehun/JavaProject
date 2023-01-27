package Gun31._02_FinalModifier.Ornek2;

public class Vatandas {
    final int tcNo;
    String tamAd;
    static int sayac = 1111111111;
    public Vatandas(String tamAd){
        this.tcNo = sayac++;
        this.tamAd = tamAd;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "tcNo=" + tcNo +
                ", tamAd='" + tamAd + '\'' +
                '}';
    }
}
