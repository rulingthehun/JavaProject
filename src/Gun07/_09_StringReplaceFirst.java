package Gun07;

public class _09_StringReplaceFirst {
    //replaceFirst: Bir String icindeki ilk karakter(leri) verilenle degistrir.
    public static void main(String[] args) {
        String text="Herkese Merhaba Dunya";
        System.out.println("textin orijinal hali = "+text);//Herkese Merhaba Dunya
        System.out.println("a -> e : "+text.replaceFirst("a","e"));//Herkese Merheba Dunya
        System.out.println("Dunya -> Java = "+text.replaceFirst("Dunya","Java"));//Herkese Merhaba Java
    }
}
