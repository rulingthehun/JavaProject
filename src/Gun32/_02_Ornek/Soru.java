package Gun32._02_Ornek;

public class Soru {
//    enum burda tanimlayabilirim
    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER(usarname) class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim
    public static void main(String[] args) {
        User user1 = new User("Burak", Role.ADMIN, Statu.AKTIF);
        User user2 = new User("Mert", Role.SATIS, Statu.AKTIF);
        User user3 = new User("Can", Role.MUDUR, Statu.PASIF);

        userSil(user1);
        userSil(user2);
        userSil(user3);
    }
    public static void userSil (User kullanici){
        if (kullanici.role == Role.ADMIN){
            System.out.println("Admin silinemez");
        }
        else {
            System.out.println("Kullanici silindi");
        }
    }
}
