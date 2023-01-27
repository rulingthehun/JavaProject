package Gun31._02_FinalModifier.Ornek2;

public class VatandaslikProgrami {
//    Vatandas isimli bir class tanimlayiniz (fields: isim, TC)
//    tcNo degerini int olarak aliniz ve nesne olustururken
//    sirali olarak atayiniz, sonradan degeri degistirilmesin
//    kontrol icin mainde 2 kisi tanimlayiniz
//    tc no nun degistirilemedigini kontrol edin
    public static void main(String[] args) {
        Vatandas vat1 = new Vatandas("Burak Gaznep");
        Vatandas vat2 = new Vatandas("Mert Gunhan");
        System.out.println("vat1 = " + vat1);
        System.out.println("vat2 = " + vat2);
    }
}
