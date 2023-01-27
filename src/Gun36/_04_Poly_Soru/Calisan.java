package Gun36._04_Poly_Soru;

public class Calisan extends Kisi{
    private String departmani;

    public Calisan(String ad, String soyad, String gorev, String departmani) {
        super(ad, soyad, gorev);
        setDepartmani(departmani);
    }

    public String getDepartmani() {
        return departmani;
    }

    public void setDepartmani(String departmani) {
        this.departmani = departmani;
    }
}
