package Gun41._01_Ornek;

public class Lahmacun implements IFood {
    void dough(){
        System.out.println("El yapimi ince hamur yapildi.");
    }
    void addMeat(){
        System.out.println("Ozel kiyma eklendi.");
    }
    void bake(){
        System.out.println("Odun atesinde pisirildi.");
    }
    @Override
    public void taste() {
        System.out.println("Mukemmel yerli pizza");
    }

    @Override
    public double ucret() {
        return 30;
    }
}
