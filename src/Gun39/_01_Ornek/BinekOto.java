package Gun39._01_Ornek;

public abstract class BinekOto {
    protected String model;
    protected int uretimYili;
    protected int vitesAdedi;

    public BinekOto(String model, int uretimYili, int vitesAdedi) {
        setModel(model);
        setUretimYili(uretimYili);
        setVitesAdedi(vitesAdedi);
    }

    abstract int hizlanmaSuresi(); //Soyut, abstract, govdesiz, sadece methodun imzasi

    public String getModel() { //Somut, concrete, govdeli
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesAdedi() {
        return vitesAdedi;
    }

    public void setVitesAdedi(int vitesAdedi) {
        this.vitesAdedi = vitesAdedi;
    }
}
