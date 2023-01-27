package Gun15;

public class _04_JavaNestedLoop {
    //     1.Satırda 5
    //      2.Satırda 4
    // **      3.Satırda 3
    // **       4.Satırda 2
    // *        5.Satırda 1
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
