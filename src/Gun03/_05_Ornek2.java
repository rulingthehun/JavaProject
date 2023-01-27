package Gun03;

public class _05_Ornek2 {
    // Ornek Soru : yarıcapı(r) verilen bir dairenin cevresini ve alanını bulunuz
    // alan= pi*r*r    cevre = 2*pi*r     " pi=3.14 "
    public static void main(String[] args) {
        double r=4.5;
        double Cevre=2*3.14*r;
        double Alan=3.14*Math.PI*r;
        System.out.println("Cevre = " + Cevre);
        System.out.println("Alan = " + Alan);
    }
}
//PI= Math.PI