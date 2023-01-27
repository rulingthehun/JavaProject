package Gun36._03_Polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek yKopek = new Kopek("Karabas");
//        yKopek.ses();
//        yKopek.kokladi();
        Kedi yKedi = new Kedi("Miril");
//        yKedi.ses();
//        yKedi.tirmaladi();

        kopekSesi(yKopek);
        kediSesi(yKedi);

        hayvanSesi(yKopek);
        hayvanSesi(yKedi);

        /**************/
        Hayvan hayvan1 = new Hayvan("Ordek"); //Hayvanlardan 1 hayvan
        Hayvan hayvan2 = new Kopek("Kangal"); //Hayvanlardan kopek
        Hayvan hayvan3 = new Kedi("Lazer"); //Hayvanlardan kedi
        //Referans          Nesne turu

        /**************/
        hayvan1.ses(); //genel hayvan
        hayvan2.ses(); //Kopek hayvan
        hayvan3.ses(); //Kedi hayvan

        hayvan2.ses(); //Kopek de olsa hayvan referansi
        // sebebiyle methodlar kisitli

        //Bu hayvanin kopek formunu ortaya nasil cikartirim?
        //Tip donusumu olabilir mi?

        ((Kopek)hayvan2).kokladi(); //Artik diger methodlari kullanabilirim
//        ((int) Math.random()) casting buradaki gibi, tip donusumu


//        Polymorphism -
//        çok formluluk  - Çok çeşitlilik
//        şizofren bir konu
//        :  Bir NESNEN istenildiğinde, aynı zamanda
//        extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.
    }
    public static void kopekSesi(Kopek yKopek){
        yKopek.ses();
        yKopek.kokladi();
    }
    public static void kediSesi(Kedi yKedi){
        yKedi.ses();
        yKedi.tirmaladi();
    }

    public static void hayvanSesi(Hayvan hayvan){
        hayvan.ses();
    }
}
