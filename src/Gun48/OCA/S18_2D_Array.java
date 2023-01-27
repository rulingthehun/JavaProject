package Gun48.OCA;

public class S18_2D_Array {
    public static void main(String[] args) {
        String[][] chs = new String[5][2];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i = 97;
        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) {
                chs[a][b] = "" + i;
            }
        }
        for (String[] ca : chs) {
            for (String c : ca) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
//    Answer:
//    E. An ArrayIndexOutOfBoundsException is thrown at runtime
}
