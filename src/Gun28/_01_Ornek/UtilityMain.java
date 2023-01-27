package Gun28._01_Ornek;

public class UtilityMain {
    public static void main(String[] args) {
        myUtility myUt = new myUtility();
        String strSayi = myUt.getString(356);
        int sayi = myUt.getInt("345");
        //bu methodlar nesneye ait

        Math.random(); //bunun gibi direkt nesne tanimlamadan kullanmak istiyorum.

        myUtility.getInt2("34");
        String sayi2 = myUtility.getString2(23);
        System.out.println("sayi2 = " + sayi2);
        //bu methodlar nesne olusturmaya ihtiyac duymayan classa ait methodlar.
    }
}
