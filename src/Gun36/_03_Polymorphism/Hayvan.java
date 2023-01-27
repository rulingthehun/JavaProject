package Gun36._03_Polymorphism;

public class Hayvan {
    private String name;

    public Hayvan(String name) {
        setName(name);
    }

    public void ses(){
        System.out.println("Ses cikardi ...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
