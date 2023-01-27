package Gun36._04_Poly_Soru;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorev;

    public Kisi(String ad, String soyad, String gorev) {
        setAd(ad);
        setSoyad(soyad);
        setGorev(gorev);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    @Override
    public String toString() {
        return "Kisi { " +
                "Ad = '" + getAd() + '\'' +
                ", Soyad = '" + getSoyad() + '\'' +
                ", Gorev = '" + getGorev() + '\'' +
                " }";
    }
    public static void KimlikBelgesiYaz(Kisi gelenKisi){
        System.out.println("\n******* Kimlik Belgesi ********");
        System.out.println("Adi = " + gelenKisi.getAd());
        System.out.println("Soyadi = " + gelenKisi.getSoyad());
        System.out.println("Gorevi = " + gelenKisi.getGorev());
        if (gelenKisi instanceof Ogrenci) //Gelen kisi Ogrenci ise
            System.out.println("Subesi = " + ((Ogrenci) gelenKisi).getSubesi());
        if (gelenKisi instanceof Calisan) //Gelen kisi Calisan ise
            System.out.println("Departmani = " + ((Calisan) gelenKisi).getDepartmani());
    }
}
