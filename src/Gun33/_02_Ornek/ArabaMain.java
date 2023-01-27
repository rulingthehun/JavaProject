package Gun33._02_Ornek;

public class ArabaMain {
    //Bir araba nesnesi olusturmak isteniyor. Fields (Renk,
    //Model, MotorHacmi, KapiSayisi)
    //Bu nesnenin verileri OOP kurallarina uygun olarak alinsin
    //Main de 1 tane nesne olusturup bunu kontrol edin
    public static void main(String[] args) {
        Araba araba1 = new Araba();
        araba1.setMarkaModel("BMW 740");
        araba1.setRenk("Beyaz");
        araba1.setMotorHacmi(4000);
        araba1.setKapiSayisi(5);
        System.out.println("araba1 = " + araba1);
        Araba araba2 = new Araba("Audi A6",
                "Mavi", 5000, 3);
        System.out.println("araba2 = " + araba2);
    }
}
