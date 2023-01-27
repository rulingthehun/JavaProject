package Gun04;

public class _05_Ornek3 {
    public static void main(String[] args) {
        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)
        double agirlik=79.8;
        int boy=186;
        System.out.println("boyunuz = " + boy + " " + "kilonuz = " + boy);
        double kitleIndex=agirlik / (boy*boy); //widening genisletme
        System.out.println("kitleIndex = " + kitleIndex);
    }
}
