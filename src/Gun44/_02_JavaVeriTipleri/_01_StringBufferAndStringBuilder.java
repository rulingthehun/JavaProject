package Gun44._02_JavaVeriTipleri;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String cumle = "";

        cumle = cumle + "Bugun ";
        cumle += "hava ";
        cumle += "soguk";
        System.out.println("cumle = " + cumle);

        System.out.println("cumle = " + cumle.concat(", dun daha sicakti."));
        System.out.println("cumle = " + cumle);

        cumle = cumle.concat(", dun daha sicakti."); //Atama gerektirir
        System.out.println("cumle = " + cumle);

        /***** String Builder *****/
        StringBuilder cumle2 = new StringBuilder();
        cumle2.append("Bugun "); // append: atama gerektirmez
        cumle2.append("hava ");
        cumle2.append("guzel.");

        System.out.println("cumle2 = " + cumle2);

        /*******  String ekleme islemlerinde performans testi  ********/
//        1. yontem:
//        "+" ile ekleme
        long startTime = System.currentTimeMillis();

        String test1 = "";
        for (int i = 0; i < 10000; i++) {
            test1 += "Merhaba";
        }

        System.out.println("+ icin gecen sure = " + (System.currentTimeMillis() - startTime) + " ms");
//        581 ms

//        2. yontem:
//        concat ile ekleme
        startTime = System.currentTimeMillis();

        String test2 = "";
        for (int i = 0; i < 10000; i++) {
            test2 = test2.concat("Merhaba");
        }

        System.out.println("concat icin gecen sure = " + (System.currentTimeMillis() - startTime) + " ms");
//        140 ms

//        3. yontem:
//        StringBuiler ile ekleme
        startTime = System.currentTimeMillis();

        StringBuilder test3 = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            test3.append("Merhaba");
        }

        System.out.println("StringBuilder icin gecen sure = " + (System.currentTimeMillis() - startTime) + " ms");
//        1 ms

//        Performans testi sonucu:
//        eger 3'e kadar ekleme islemi yapilacaksa + kullanilir -> pratik
//        Daha fazla ekleme olacaksa 10 adede kadar concat kullanilabilir
//        Eger cok fazla String ekleme islemi yapilacaksa StringBuilder Kullanilir

        System.out.println("******************\n\n");
        /***** String Builder *****/
        StringBuilder s = new StringBuilder();
        s.append("Bugun ");
        s.append("hava ");
        s.append("guzel.");
        System.out.println("s = " + s);

        System.out.println("s.length() = " + s.length());
        s.append(2); //eklenen her seyin toString haldi varsa cevirerek ekler
        System.out.println("s = " + s);

        s.reverse(); //String'i tersine cevirir
        System.out.println("s = " + s);

        s.reverse();
        s.delete(0,5); //0 dahil 5 haric indexleri arasini siler
        System.out.println("s = " + s);

        s.deleteCharAt(3); //sadece belirtilen indexteki karakteri siler
        System.out.println("s = " + s);

        s.insert(5, " kelime "); //5 nolu indexe eklendi
        System.out.println("s = " + s);

        s = new StringBuilder("Bugun hava sicak");
        System.out.println("s = " + s);

        s.replace(2,10, "bu"); //verilen araligi girilenle degtirdik
        System.out.println("s = " + s);

        StringBuffer sBuffer = new StringBuffer(); //Tamamen StringBuilder ile ayni
//        Tek farki paralel calisan yazilimlarda StringBuffer kullanilir
    }
}
