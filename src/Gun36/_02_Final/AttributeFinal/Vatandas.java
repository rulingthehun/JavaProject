package Gun36._02_Final.AttributeFinal;

public class Vatandas {
    public final String tcNo;

    public Vatandas(String tcNo) {
        this.tcNo = tcNo;
        //Sadece constructor da kullanilabilir
        //Ilk deger atamasi sart
        //Ya olusturuldugu anda ya da Constructor da
    }

    @Override
    public String toString() {
        return "Vatandas { " +
                "TC No = '" + tcNo + '\'' +
                " }";
    }
}
