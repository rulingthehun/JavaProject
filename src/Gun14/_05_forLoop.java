package Gun14;

public class _05_forLoop {
    // 2 ler çarpım tablosunu , tablo olarak yazdırınız.
    // 5 ile 7 arasındaki sayıları pas geçirsin
    public static void main(String[] args) {
        int carpim = 0;
        for (int i = 1; i <= 10; i++) {
            if (i >= 5 && i <= 7) {
                continue;
            }
                carpim = i * 2;
            System.out.println("2 x " + i + " = " + carpim);
        }
    }
}
