package Gun34._03_Ornek;

public class Calisan {
    private String tamIsim;
    private double maas;
    private double maasKatSayisi;

    public String getTamIsim() {
        return tamIsim;
    }

    public void setTamIsim(String tamIsim) {
        this.tamIsim = tamIsim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public double getMaasKatSayisi() {
        return maasKatSayisi;
    }

    public void setMaasKatSayisi(double maasKatSayisi) {
        this.maasKatSayisi = maasKatSayisi;
    }

    public Calisan(String tamIsim, double maas, double maasKatSayisi) {
        setTamIsim(tamIsim);
        setMaas(maas);
        setMaasKatSayisi(maasKatSayisi);
    }

    public double MaasHesapla() {
        return maas * maasKatSayisi;
    }

    @Override
    public String toString() {
        return "Calisan {" +
                " Isim = '" + tamIsim + '\'' +
                ", maas = " + maas +
                ", maasKatSayisi = " + maasKatSayisi +
                " }";
    }
}
