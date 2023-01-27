package Gun39._02_Ornek;

public class Dikdortgen extends Sekil{
    private int kisaKenar;
    private int uzunKenar;

    public Dikdortgen(String name, int kisaKenar, int uzunKenar) {
        super(name);
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    public Dikdortgen(String name) {
        super(name);
    }

    @Override
    public double alan() {
        return this.uzunKenar * this.kisaKenar;
    }

    @Override
    public double cevre() {
        return (this.uzunKenar + this.kisaKenar) * 2;
    }
}
