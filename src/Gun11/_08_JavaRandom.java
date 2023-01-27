package Gun11;

public class _08_JavaRandom {
    // Soru : 0 ile 6(hariç) arasında random sayı üreten programı yazını
    public static void main(String[] args) {
        double doubleRandomSayi = Math.random();
        // 0.0 ile 6 arasinda random sayi
        int intRandomSayi = (int) (doubleRandomSayi * 6);
        System.out.println("intRandomSayi = " + intRandomSayi);
        //Direkt yontem
        System.out.println((int) (Math.random() * 6));
    }
}