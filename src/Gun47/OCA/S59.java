package Gun47.OCA;

public class S59 {
    public static void main(String[] args) {
        int[] intArr = {8, 16, 32, 64, 128};
//        Option B
        for (int i : intArr){
            System.out.print(i + " ");
        }
        System.out.println();
//        Option E
        for (int i = 0; i < intArr.length; i++){
            System.out.print(intArr[i] + " ");
        }
    }
}
