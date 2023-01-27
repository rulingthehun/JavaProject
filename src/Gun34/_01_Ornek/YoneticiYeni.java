package Gun34._01_Ornek;
//extends -> miras al
public class YoneticiYeni extends Personel {
    private double yoneticiTazminati;

    public void zamYap() {
        System.out.println("Zam yapildi");
    }

    public double getYoneticiTazminati() {
        return yoneticiTazminati;
    }

    public void setYoneticiTazminati(double yoneticiTazminati) {
        this.yoneticiTazminati = yoneticiTazminati;
    }
}
