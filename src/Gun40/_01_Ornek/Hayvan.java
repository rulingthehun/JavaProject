package Gun40._01_Ornek;

public abstract class Hayvan {
    protected int id;
    protected String isim;
    protected boolean vahsi;
    protected String dogumTarihi;
    protected static int idSayac = 0;


    abstract void yiyecegi();
    abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        setId(++idSayac);
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
    }

    public static int getIdSayac() {
        return idSayac;
    }

    public static void setIdSayac(int idSayac) {
        Hayvan.idSayac = idSayac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        yemekMiktari();
        gunlukUykuSuresi();
        yiyecegi();
        sesi();
        return "Hayvan{" +
                "Id = " + getId() +
                ", Isim = '" + getIsim() + '\'' +
                ", Vahsi = " + isVahsi() +
                ", Dogum Tarihi = '" + getDogumTarihi() + '\'' +
                '}';
    }
}
