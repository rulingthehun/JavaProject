package Gun35._02_01_Ornek;

public class Kare {
    private double kenar;

    public double kareCevre (){
        return getKenar() * 4;
    }
    public double kareAlan (){
        return getKenar() * getKenar();
    }

    public Kare(double kenar) {
        setKenar(kenar);
    }

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public String toString() {
        return "Kare { " +
                "kenar = " + getKenar() +
                " cm }";
    }
}
