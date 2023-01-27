package Gun29._02_Constructor;

public class Kitapci {
    // Book class yazınız.fields: name,publishYear,author.
    // 3 adet Consructor ekleyiniz.
    // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
    // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.
    public static void main(String[] args) {
        Kitaplar kit1 = new Kitaplar();
        kit1.name = "Dune";
        kit1.publishYear = 1965;
        kit1.author = "Frank Herbert";

        Kitaplar kit2 = new Kitaplar("Yuzukler", "JRR Tolkien");

        Kitaplar kit3 = new Kitaplar("Witcher");

        kit1.yazdir();
        kit2.yazdir();
        kit3.yazdir();

        System.out.println("kit1 = " + kit1);
        System.out.println("kit2 = " + kit2);
        System.out.println("kit3 = " + kit3);
    }
}
