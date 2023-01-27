package Gun37._03_Ornek;

public class Geometri {
    public static void main(String[] args) {
//        Bir intarface in birden fazla class tarafindan implemente edilmesi.
        Cember c = new Cember();
        c.ciz();

        Dikdortgen d = new Dikdortgen();
        d.ciz();

//        Interface lerden nesne uretilir fakat referans tipi olusturulabilir.
//        Bu bize Polymorphism sagladi
        ICizdirir c2 = new Cember();
        c2.ciz();

        cizdirir(c);
        cizdirir(d);
    }
//    Interface -> ParentClass -> SubClass
//    Interface -> Class

//    Interface1
//    Interface2 -> ParentClass -> SubClass

//    Interface1
//    Interface2 -> Class
    public static void cizdirir (ICizdirir iciz){
        iciz.ciz();
    }
}
