package Gun02;

public class _06_Degiskenler {
    public static void main(String[] args) {
        //Degiskenler - Variable
        int sayi; //int: tam sayi saklayacak kadar hafizada yer ayirir ve onun adina sayi diyor
        // degiskenin adi sayi, tipi int, int: tam sayi INTEGER

        int saYi; // bir harf bile farkli olsa farkli degiskendir
        int sAYI; // buyuk harf ve kucuk harf tamamen farkli degiskenlerdir.
        // Java buyuk kucuk harf duyarli (case sensitive) dildir.
        sayi=5; // sayinin degeri 5 oldu
        System.out.println("sayi"); // cift tirnak arasindaki her sey direkt ekrana yazilir
        System.out.println(sayi); // degiskenin adini direkt yazarsak DEGERINI yazar
        System.out.println("sayi="+sayi); // sayi=5
        sayi=7; // sayinin degeri 7 oldu
        int KisaKenar=5;
        int UzunKenar=7;
        int cevre=KisaKenar+KisaKenar+UzunKenar+UzunKenar;
        System.out.println("ceversi="+cevre);
    }
}
