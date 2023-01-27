package Gun30._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan cal1 = new Calisan();
        cal1.id = 1; //Siradan gelen sayi verilmeli
        cal1.name="Burak";
        cal1.surName = "Gaznep";
//        cal1.password = "123"; //Direkt erisiliyor
        //Kontrolsuz atandi
        //Direkt erisime kapali olmasi lazim
        //Bunun yerine class a method ekledim
        cal1.sifreAta("123");
        cal1.sifreAta("sdfsg356473");
        System.out.println(cal1.sifreGoster());
    }
}
