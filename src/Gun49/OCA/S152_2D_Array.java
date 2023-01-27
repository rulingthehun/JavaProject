package Gun49.OCA;

public class S152_2D_Array {
    public static void main(String[] args) {
        int n[][] = {{1, 3}, {2, 4}};
        for (int i = n.length - 1; i >= 0; i--) {
            for (int y : n[i]) {
                System.out.print(y);
            }
        }
    }
//    Answer:
//    D. 2413
}