package Gun15;

public class _05_JavaNestedLoop {
    // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
    // *
    //
    // *
    //
    // *
    //
    //
    // **
    // **
    // *
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
