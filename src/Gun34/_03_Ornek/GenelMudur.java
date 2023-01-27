package Gun34._03_Ornek;

public class GenelMudur extends Calisan {
    private double tazminat;

    public GenelMudur(String tamIsim, double maas,
                      double maasKatSayisi, double tazminat) {
        super(tamIsim, maas, maasKatSayisi);
        setTazminat(tazminat);
    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public double MaasHesapla() {
        return super.MaasHesapla() * tazminat;
    }


    @Override
    public String toString() {
        return "GenelMudur {" +
                " Isim = " + super.getTamIsim() +
                ", tazminat = " + tazminat +
                ", maas = " + super.getMaas() +
                ", maas katsayisi = " + super.getMaasKatSayisi() +
                " }";
    }
}
