package Gun04;

public class _00_Giris {
    public static void main(String[] args) {
        byte ogrNot=90;
        int notToplam=ogrNot; //byte turunu int turune atamis olduk, Widening casting, genisletme
        ogrNot=(byte)notToplam; //int turunu byte turune donusturduk
        //bunu ancak veri kaybi olusmuyorsa yani DEGER atanacak tipe sigiyorsa yapilabilir.
        //bunu da bilerek yaptigini belirtmek icin donusecek tipin basina hedef tipin adi
        //parantez icinde yazilir. Daraltma (Narrow) yonunde donusum (Casting) denir.
    }
}
