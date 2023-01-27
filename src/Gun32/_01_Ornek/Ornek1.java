package Gun32._01_Ornek;

public class Ornek1 {
    //Verilen bir ay no ya gore ayin gun sayisini veren programi yazin
    public static void main(String[] args) {
        int ayNo = 5;
        switch (ayNo) {
            case 2:
                System.out.println(28);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 22:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
        }
        //okunabilirlik ve kontrollu yazilim yok, tanimlama yetersiz

        String ad = "Mayis";
        switch (ad) {
            case "Subat":
                System.out.println(28);
                break;
            case "Ocak":
            case "Mart":
            case "Nisan":
            case "Agustos":
            case "Haziran":
            case "Aralik":
                System.out.println(31);
                break;
            case "Temmuz":
            case "Eylul":
            case "Ekim":
            case "Kasim":
                System.out.println(30);
                break;
        }
        if (ad == "Mayis") {
            System.out.println("Mayis ayi 31 gun");
        }
    }
}
