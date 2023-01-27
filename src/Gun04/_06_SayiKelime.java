package Gun04;

public class _06_SayiKelime {
    public static void main(String[] args) {
        /*stringi sayiya cevirmek*/
        String ad="ismet";
        String kelimeSayi="65"; //su anda bu ayni ad gibi simge yani rakam degil
        // fakat rakam, sayi gorunumlu ise sayiya donusturebilirim.
        int intDeger= Integer.parseInt(kelimeSayi); // sayi gorunumlu simgeyi sayiya donsturdu.
        System.out.println("intDeger = " + intDeger);
        int toplam= intDeger+5;
        System.out.println("toplam = " + toplam);
        byte byteDeger= Byte.parseByte(kelimeSayi); // sayi gorunumlu simgeyi sayiya (byte) donusturdu.
        System.out.println("byteDeger = " + byteDeger);
        /*sayilari stringe cevirmek*/
        int sicaklik=18;
        //bugun hava sicakligi 18 derece
        System.out.println("Bugun hava sicakligi "+sicaklik+" derece"); //oto stringe donustu
        String sicaklikKelimeHali= Integer.toString(sicaklik); //toplanamaz
        //int toplam2= sicaklikKelimeHali +5 yapilamaz cunku artik string.
        System.out.println("Bugun hava sicakligi " + sicaklikKelimeHali+" derece");
    }
}
