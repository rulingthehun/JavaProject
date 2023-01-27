package Gun36._01_Protected.Paket2;

import Gun36._01_Protected.Paket1.P1Hayvan;

public class Kedi extends P1Hayvan {
    public Kedi(String ad, String cinsi) {
        super.ad = ad;
        super.cinsi = cinsi;
        //protectedlara exdends olarak diger paketerden erisilebilir
    }

    @Override
    public String toString() {
        return "Kedi { " +
                "Ad = '" + ad + '\'' +
                ", Cinsi = '" + cinsi + '\'' +
                " }";
    }
}
