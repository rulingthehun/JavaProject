package Gun41._01_Ornek;

public class Adana_Kebap implements IFood {
    void marinade(){
        System.out.println("Et dunden marine edildi.");
    }
    void grill(){
        System.out.println("Komur atesinde yavas pisirildi.");
    }
    @Override
    public void taste() {
        System.out.println("Etin en guzel hali");
    }

    @Override
    public double ucret() {
        return 50;
    }
}
