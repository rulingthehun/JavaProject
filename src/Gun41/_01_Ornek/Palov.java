package Gun41._01_Ornek;

public class Palov implements IFood {
    void fry(){
        System.out.println("Pirinc ve sehriye kavruldu.");
    }
    void boil(){
        System.out.println("Kisik ateste pisirildi.");
    }
    @Override
    public void taste() {
        System.out.println("Cocuklarin vazgecilmezi.");
    }

    @Override
    public double ucret() {
        return 20;
    }

}
