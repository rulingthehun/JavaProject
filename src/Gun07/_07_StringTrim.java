package Gun07;

public class _07_StringTrim {
    public static void main(String[] args) {
        //trim: Stringin basinda veya sonundaki bosluklari temizler.
        String text = " Merhaba Dunya ";
        System.out.println("orijinal hali = " + text + "<-");
        System.out.println("textin trimlenmis hali = "+text.trim()+"<-");
    }
}