package Gun28._02_Ornek;

public class Soru {
    // Math sınıfndaki metodlarıdan 5 tanesini
// kendi isimlendirmenizle ayrı bir sınıfta yazarak,
// (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
// mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
// kullanımlarını yazınız.
    public static void main(String[] args) {
        System.out.println(MyMath.getMin(4, 2));
        System.out.println(MyMath.getRandom(6));
        System.out.println("Random = " + MyMath.getRandom(3, 7));
        System.out.println("Round = " + MyMath.getRound(6.345));
    }
}
