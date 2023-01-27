package Gun36._02_Final.ClassFinal;

public class ArabaMain {
    public static void main(String[] args) {
        Vasita v = new Vasita();
        v.cinsi = "Kara tasiti"; //"final" kullanimda sorun yok
        System.out.println(v);
    }
}
