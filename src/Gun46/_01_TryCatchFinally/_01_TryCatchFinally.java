package Gun46._01_TryCatchFinally;

public class _01_TryCatchFinally {
    public static void main(String[] args) {
        long startTime = 0;
        String str = "";

        try {
            startTime = System.currentTimeMillis();
            System.out.println("Hatadan onceki nokta");
            char ilkHarf = str.charAt(0); //hata noktasi
            System.out.println("Hatadan sonraki nokta");
        } catch (Exception ex) {
            System.out.println("catch blogu calisti");
        } finally { //try-catch'in finali: her zaman calisir
            long gecenSure = System.currentTimeMillis() - startTime;
            System.out.println("gecenSure = " + gecenSure + " ms");
            System.out.println("try-catch bloguyla ilgili son yapilacaklar");
//            Hata olsun veya olmasin calisan kisim
//            her zaman calisir
//            islemlerde geriye kalan yapilacaklar bu bolumde yapilir
//            kullanim sebebi her iki durum sonrasinda geriye kalan yapilacaklar
//            birlikte olsun diyedir
        }

        System.out.println("Diger calisan kodlar");

        System.out.println("Program sonu");
    }
}
