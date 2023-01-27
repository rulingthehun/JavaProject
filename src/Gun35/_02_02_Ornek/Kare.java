package Gun35._02_02_Ornek;

public class Kare extends Dikdortgen{
    public Kare(double Kenar) {
        super(Kenar, Kenar);
    }

    @Override
    public String toString() {
        return "Kare -> Kenar = " + getUzunKenar()
                + " cm";
    }
}
