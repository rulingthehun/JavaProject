package Gun47.OCA;

public class S37 {
    public static void main(String[] args) {
        int[] intArr = {15, 30, 45, 60, 75};
        intArr[2] = intArr[4];
        intArr[4] = 90;
        for (int x : intArr){
            System.out.print(x + ", ");
        }
    }
}
