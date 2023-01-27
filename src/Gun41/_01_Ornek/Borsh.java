package Gun41._01_Ornek;

public class Borsh implements IFood {
    void boil(){
        System.out.println("Kisik ateste kaynatiliyor.");
    }

    void eatTomorrow(){
        System.out.println("Bir gun sonra servis edilir.");
    }
    @Override
    public void taste() {
        System.out.println("Sicak sebze corbasi");
    }

    @Override
    public double ucret() {
        return 20;
    }
}
