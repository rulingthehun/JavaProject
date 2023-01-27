package Gun07;

public class _06_StringToUpperCase {
    public static void main(String[] args) {
        //ToUpperCase: String buyuk harfe cevirir.
        String text="Merhaba Dunya";
        System.out.println("orijinal hali = " + text);
        System.out.println("textin buyuk harf hali = " + text.toUpperCase());
        System.out.println("Case sensitive olmadan 'Iceriyor mu?'");
        System.out.println("sonuc = " + text.toUpperCase().endsWith("YA"));
    }
}
