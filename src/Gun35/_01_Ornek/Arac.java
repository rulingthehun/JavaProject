package Gun35._01_Ornek;

public class Arac {
    private String renk;
    private int motorHacmi;
    private String marka;

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

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Arac(String renk, int motorHacmi, String marka) {
        setRenk(renk);
        setMotorHacmi(motorHacmi);
        setMarka(marka);
    }

    @Override
    public String toString() {
        return "Arac {" +
                " Marka = '" + marka + '\'' +
                ", Motor Hacmi =" + motorHacmi +
                ", Renk = '" + renk + '\'' +
                " }";
    }
}
