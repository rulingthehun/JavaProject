package Gun35._01_Ornek;

public class Otobus extends Arac {
    private int yolcuKapasitesi;

    public Otobus(String renk, int motorHacmi,
                  String marka, int yolcuKapasitesi) {
        super(renk, motorHacmi, marka);
        setYolcuKapasitesi(yolcuKapasitesi);
    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    @Override
    public String toString() {
        return "Otobus { " +
//                super.toString() +
                " Marka = '" + super.getMarka() + '\'' +
                ", Motor Hacmi = " + super.getMotorHacmi() +
                ",  Renk = '" + super.getRenk() + '\'' +
                ", Yolcu Kapasitesi = " + yolcuKapasitesi +
                " }";
    }
}
