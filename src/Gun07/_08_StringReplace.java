package Gun07;

public class _08_StringReplace {
    //Replace: Bir stringin icindeki karakterleri verilenle degistirir.
    public static void main(String[] args) {
        String text="Merhaba Dunya";
        System.out.println("textin orijinal hali = " + text);
        System.out.println("a -> e = "+text.replace("a","e"));//merhebe dunye
        System.out.println("ba -> de = "+text.replace("ba","de"));// Merhade Dunya
        System.out.println("Dunya -> Java = "+text.replace("Dunya","Java"));
        System.out.println("a'lari sil = "+text.replace("a",""));
        System.out.println("bosluklari temizle = "+text.replace(" ",""));
    }
}
