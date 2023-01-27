package Gun39._01_Ornek;

public class Ford extends BinekOto{
    public Ford(String model, int uretimYili, int vitesAdedi) {
        super(model, uretimYili, vitesAdedi);
    }

    @Override
    public String toString() {
        return "Ford { " +
                "Model = '" + model + '\'' +
                ", Uretim Yili = " + uretimYili +
                ", Vites Adedi = " + vitesAdedi +
                " }";
    }

    @Override
    int hizlanmaSuresi() {
        return getUretimYili() * getVitesAdedi();
    }
}
