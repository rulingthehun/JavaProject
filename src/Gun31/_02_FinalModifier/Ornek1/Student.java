package Gun31._02_FinalModifier.Ornek1;

public class Student {
    final int okulNo;
    String tamAd;
    static int sayac = 1;

    public Student(String tamAd) {
        this.okulNo = sayac++;
        this.tamAd = tamAd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "okulNo=" + okulNo +
                ", tamAd='" + tamAd + '\'' +
                '}';
    }
}
