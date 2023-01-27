package Gun14;

public class _02_forLoop {
    // 0 den 10(dahil) kadar sayıları ekrana yazdırınız.
    // 10 dan 0(dahil) kadar sayıları ekrana yazdırınız.(ayri bir diğer for)
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            System.out.println("i = " + i);
        }
        for (int j=10; j>=0; j--){
            System.out.println("j = " + j);
        }
    }
}
