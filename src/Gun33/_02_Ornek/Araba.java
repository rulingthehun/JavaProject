package Gun33._02_Ornek;

public class Araba {
    private String markaModel;
    private String renk;
    private int motorHacmi;
    private int kapiSayisi;

    @Override
    public String toString() {
        return "Araba { \n" +
                "markaModel = '" + markaModel + "', " + '\n' +
                "renk = '" + renk + "', " + '\n' +
                "motorHacmi = " + motorHacmi + "', " + '\n' +
                "kapiSayisi = '" + kapiSayisi + "' " +
                 '}';
    }

    public Araba() {
    }

    public Araba(String markaModel, String renk, int motorHacmi, int kapiSayisi) {
        this.markaModel = markaModel;
        this.renk = renk;
        this.motorHacmi = motorHacmi;
//        this.kapiSayisi = kapiSayisi;
        setKapiSayisi(kapiSayisi);
    }

    public String getMarkaModel() {
        return markaModel;
    }

    public void setMarkaModel(String markaModel) {
        this.markaModel = markaModel;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }
}
