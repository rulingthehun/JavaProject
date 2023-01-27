package Gun48.OCA;

public class S71_2D_Array {
    public static void main(String[] args) {
        int[][] arr = new int[2][4];
        arr[0] = new int[] {1, 3, 5, 7};
        arr[1] = new int[] {1, 3};
        for (int[] a : arr){
            for (int i = 0; i < arr.length; i++){
                System.out.print(a[i] + " ");
//                System.out.println(arr.length); Satir sayisi = 2
//                System.out.println(arr[0].length); 1. satirin uzunlugu = 4
//                System.out.println(arr[1].length); 2. satirin uzunlugu = 2
            }
            System.out.println();
        }
    }
//    Answer:
//    B. 1 3
//       1 3
}
