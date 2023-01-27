package Gun39._03_Ornek;

public class YemekDunyasi {
    public static void main(String[] args) {
        Baklava antepSarma = new Baklava();
        System.out.println("Baklava -> antepSarma");
        antepSarma.madeIn();
        antepSarma.taste();

        Sezar_Salad s = new Sezar_Salad();
        System.out.println("Sezar_Salad");
        s.madeIn();
        s.taste();
    }
}
