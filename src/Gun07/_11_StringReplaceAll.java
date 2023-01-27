package Gun07;

public class _11_StringReplaceAll {
    public static void main(String[] args) {
        //ReplaceAll: replace gibi calisir, farki kriter (regex) verileebilir.
        //regex: regular expression / duzenli ifadeler
        //TODO (yapilacak): regex olarak neler yazilabiliyor arastir.
        String text="Merhaba Dunya123";
        System.out.println("text = " + text); //Merhaba Dunya123
        System.out.println("abn-> _ = " + text.replaceAll("[abn]","_")); //Merh___ Du_y_123
        //sadece abn
        System.out.println("a-z -> _ = " + text.replaceAll("[a-z]","_")); //M______ D____123
        //kucuk harfler
        System.out.println("0-9 -> yok et = "+text.replaceAll("[0-9]","")); //0-9 -> yok et = Merhaba Dunya
        //sayilar
        System.out.println("0-9 kalsin = "+text.replaceAll("[^0-9]","")); //0-9 kalsin = 123
        //sayilarin disindakiler
        //[^] girilenin tersini degistirir.
    }
}
