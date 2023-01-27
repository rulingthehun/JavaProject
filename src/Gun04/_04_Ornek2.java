package Gun04;

public class _04_Ornek2 {
    public static void main(String[] args) {
        // 1 tane double ve 1 tane short değişken tanımlayınız,
        // değer atayınız, sonra double değişkeni short değişkene çevirerek,
        // bütün değerleri ekrana yazdırınız.
        double doubleDeger=6.3245346;
        short shortDeger=2;
        System.out.println("once shortDeger = " + shortDeger);
        shortDeger=(short)doubleDeger;
        System.out.println("sonra shortDeger = " + shortDeger);
    }
}