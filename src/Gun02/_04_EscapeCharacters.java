package Gun02;

public class _04_EscapeCharacters {
    public static void main(String[] args) {
        //Escape Characters
        // \n -> yeni satir aciyor, alt satira geciyor
        // \t -> tab tusu etkisi
        // \b -> Backspace etkisi
        // \" -> cift tirnak yazar
        // \\ -> \ isartini yazar
        // \r -> satir basina geri gider ve satir basina kadar olan karakterlerin hepsini siler
        System.out.println("MerhabaDunya");
        System.out.println("Merhaba\nDunya");
        System.out.println("Merhaba\tDunya");
        System.out.println("Merhaba\bDunya");
        System.out.println("Merhaba\"Dunya");
        System.out.println("Mehraba\\Dunya");
        System.out.println("Merhaba\rDunya");
    }
}