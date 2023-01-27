package Gun35._02_01_Ornek;

public class Daire {
    private double yariCap;

    public double daireCevre(){
        return 2 * Math.PI * getYariCap();
    }
    public double daireAlan(){
        return Math.PI * Math.pow(getYariCap(), 2);
    }
    public Daire(double yariCap) {
        setYariCap(yariCap);
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    public String toString() {
        return "Daire { " +
                "Yari Cap = " + yariCap +
                " cm }";
    }
}
