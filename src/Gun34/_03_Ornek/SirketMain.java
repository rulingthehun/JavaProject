package Gun34._03_Ornek;

public class SirketMain {
    public static void main(String[] args) {
        GenelMudur mudur = new GenelMudur("Burak Gaznep",
                550,12, 900);
        System.out.println("mudur = " + mudur);
        System.out.println("Mudur Burut Maas = " + mudur.MaasHesapla() + " €");
        Calisan pers = new Calisan("Mert Gunhan", 2999.99,
                1.27);
        System.out.println("pers = " + pers);
        System.out.println("pers.MaasHesapla() = " + pers.MaasHesapla() + " ₺");
    }
}