package Gun49.OCA;

public class S87_2D_Array {
    public static void main(String[] args) {
        int n[][] = {{1, 3}, {2, 4}};
        for (int i = n.length - 1; i >= 0; i--){
            for (int j = n[i].length - 1; j >= 0; j--){
                System.out.print(n[i][j]);
            }
        }
    }
//    Answer:
//    D. 4231
}
