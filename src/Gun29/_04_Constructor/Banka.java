package Gun29._04_Constructor;

public class Banka {
    String adi;
    int subeSayisi;
    int kurulusYili;

    public Banka() {
    }

    public Banka(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public Banka(String adi, int subeSayisi) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
    }

    public Banka(String adi) {
        this.adi = adi;
    }

    @Override
    public String toString() {
        String donecek = "Banka : ";
        if (adi != null)
            donecek += "adi = '" + adi + '\'';
        if (subeSayisi > 0)
            donecek += ", sube sayisi = " + subeSayisi;
        if (kurulusYili > 0)
            donecek += ", kurulus yili = " + kurulusYili;
        return donecek;
    }
}
