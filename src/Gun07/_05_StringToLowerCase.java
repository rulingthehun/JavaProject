package Gun07;

public class _05_StringToLowerCase {
    public static void main(String[] args) {
        //toLowerCase: stringi- kucuk harfe cevirir.
        String text="Merhaba Dunya";
        System.out.println("Orijinal hali = " + text);//Merhaba Dunya
        System.out.println("text.toLowerCase() = " + text.toLowerCase());
        System.out.println("Text buyuk veya kucuk harfle me ile basliyor mu?" +" "+ text.toLowerCase().startsWith("me"));
        System.out.println("text = " + text);
        text=text.toLowerCase();
        System.out.println("text = " + text);
    }
}
