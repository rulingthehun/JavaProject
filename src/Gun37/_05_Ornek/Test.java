package Gun37._05_Ornek;

public class Test implements IGosterir, IYazdirir{
    @Override
    public void goster() {
        System.out.println("Gosterdi");
    }

    @Override
    public void yaz(String msg) {
        System.out.println(msg);
    }

    @Override
    public void yaz() {
        System.out.println("Yazdirdi");
    }
}

//    benzinli bir araç
//        direksiyon
//    benzinmetodları
//            farMetdoları
//
//    elektrikli bir araç
//        direksiyon
//    elektrikMotormetdoları
//            farmetodları
//
//
//    EletrkliBenzinli araç yapmaya karar verdiniz.
//        direksiyon
//        benzinmetodları
//    elektrikMotormetdoları
//            farmetodları