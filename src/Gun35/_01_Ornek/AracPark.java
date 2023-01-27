package Gun35._01_Ornek;

public class AracPark {
    public static void main(String[] args) {
        Otobus schoolBus = new Otobus("Sari", 6000,
                "GMC", 35);
        System.out.println("School Bus = " + schoolBus);
        Arac oto = new Arac("Siyah", 5000,
                "Dodge");
        System.out.println("Oto = " + oto);
    }
}
//access modifier : metod,class, fields nereelrden erişilebilir
//public : herden (diğer paketlerden,kedi paketinden, kendi class
// ından erişilebilir)
//defualt: sadece kendi paketinden ve knedi classının
// içinde erişilebilir
//private: sadece class ından erişilebilir.direk atama yok.
//
//        get-set
//private filedlar için bir metod ile kontrollu erişim sağlanır,
// veri atanı veya alınır.
//        atamaya set, almaya get diyoruz. şifreyi atama gibi
//        düşünelim yani, kontrol ederek şifre
//        atama kurallarına uyugn ise ata , bunu kontrol
//        edecek metoda SET metodu diyoruz.