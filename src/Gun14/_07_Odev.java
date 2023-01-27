package Gun14;

public class _07_Odev {
    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız
    //ASCII tablosu
    public static void main(String[] args) {
        for (int i = 0; i<=255; i++){
            char harf = (char)i;
            System.out.println(i+" harf = " + harf);
        }
    }
}
