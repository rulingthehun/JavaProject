package Gun36._03_Polymorphism;

public class Kopek extends Hayvan {

    public Kopek(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("Havladi");
    }

    public void kokladi(){
        System.out.println("Kokladi");
    }
}
