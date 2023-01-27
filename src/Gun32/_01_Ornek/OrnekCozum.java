package Gun32._01_Ornek;

public class OrnekCozum {
    enum Aylar {
        OCAK, SUBAT, MART, NISAN, MAYIS, HAZIRAN,
        TEMMUZ, AGUSTOS, EYLUL, EKIM, KASIM, ARALIK
    }

    public static void main(String[] args) {
        Aylar ay = Aylar.MAYIS;
        //verilen ayin gun sayisi bulundu
        switch (ay) {
            case SUBAT:
                System.out.println("28");
                break;
            case OCAK:
                System.out.println("31");
                break;
            case MART:
                System.out.println("31");
                break;
            case MAYIS:
                System.out.println("31");
                break;
            case TEMMUZ:
                System.out.println("31");
                break;
            case AGUSTOS:
                System.out.println("31");
                break;
            case EKIM:
                System.out.println("31");
                break;
            case EYLUL:
                System.out.println("30");
                break;
            case ARALIK:
                System.out.println("31");
                break;
            case NISAN:
                System.out.println("30");
                break;
            case KASIM:
                System.out.println("30");
                break;
            case HAZIRAN:
                System.out.println("30");
                break;
        }
        //bordro programinda belli bir ay icin islem yapma
        if (ay == Aylar.MAYIS) {
            System.out.println("Zam yapildi");
        }
        System.out.println("ay = " + ay); //toString
        System.out.println("ay.name() = " + ay.name()); //simge olarak kullanilan kelime
        System.out.println("ay.ordinal() = " + ay.ordinal()); //simgenin Indexi
        for (Aylar a : Aylar.values()) //Enum yapisindaki tum bilgiler
            System.out.println(a.name() + " - " + (a.ordinal() + 1)); //Ay no ve adi
    }
}
