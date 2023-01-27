package Gun20;

public class _02_JavaMethod {
    //buraya methodlar yazilabilir
    public static void main(String[] args) {
        Math.max(5,6);
        System.out.println("Merhaba Dunya");
        System.out.println("Merhaba Dunya");


        merhabaYaz(); //Kulanimi kolay, cagirmasi kolay, tekrar tekrar kullanilabilir
        merhabaYaz(); //mainin anlasilmasini kolaylastirir
        merhabaYaz();
    }
    //buraya methodlar yazilabilir
    public static void merhabaYaz(){
        System.out.println("Fonksiyonda Merhaba Dunya");
    }
    // Metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
    // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
    // temiz kod için
}
