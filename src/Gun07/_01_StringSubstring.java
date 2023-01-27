package Gun07;

public class _01_StringSubstring {
    public static void main(String[] args) {
        //stringin belli bir bolumunu alma islemi yapar.
        String s1="Merhaba arkadaslar";
        String parca1=s1.substring(3,7); //3 nolu indexten 7 nolu indexe kadar alir.
        System.out.println("parca1 = " + parca1);
        String parca2=s1.substring(8,15);
        System.out.println("parca2 = " + parca2);
        String parca3=s1.substring(8); //verilenden baslar sonuna kadar alir.
        System.out.println("parca3 = " + parca3);
    }
}
