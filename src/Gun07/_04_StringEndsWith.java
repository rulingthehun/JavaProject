package Gun07;

public class _04_StringEndsWith {
    public static void main(String[] args) {
        //EndsWith: verilen karakter(ler) ile bitiyor mu?
        //Sonuc true ya da false yani boolean doner.
        String text="Merhaba Dunya";
        System.out.println("ya ile bitiyor mu? = " + text.endsWith("ya"));//true
        System.out.println("a ile bitiyor mu? = " + text.endsWith("a"));//true
        System.out.println("A ile bitiyor mu? = " + text.endsWith("A"));//false
        System.out.println("ny ile bitiyor mu? = " + text.endsWith("ny"));//false
        System.out.println("m ile bitiyor mu? = " + text.endsWith("m"));//false
    }
}
