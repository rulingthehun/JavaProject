package Gun48.OCA;

public class S45_2D_Array {
    public static void main(String[] args) {
        int num[][] = new int[3][1];
        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num[i].length; j++){
                num[i][j] = 10;
                System.out.println("num [" + i + "][" + j + "] = " + num[i][j]);
            }
        }
    }
//    Answer:
//    B. Option B
//    num [0][0] = 10
//    num [1][0] = 10
//    num [2][0] = 10
}
