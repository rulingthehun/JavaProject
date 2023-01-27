package Gun19;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int[] dizi = new int[10]; //bos defualt deger 0
        int[] dizi2 = {34, 5, 67, 88, 93, 44, 45, 55, 66, 33}; //10 elemanli degerleri bastan atadik

        int[][] tablo = new int[2][3]; //bos defualt deger 0
        int[][] tablo1 = {{3, 4, 5}, {56, 7, 88}};//her bir satir icin iceride {} acilir
        //{3,4,5} 1.satir, {56,7,88} 2. satir

        for (int satir = 0; satir < 2; satir++) {
            System.out.print(tablo1[satir][0]); //her satirin ilk elemani 0 index
            System.out.print(" " + tablo1[satir][1]); //her satirin ikinci elemani 1 index
            System.out.print(" " + tablo1[satir][2]); //her satirin ucuncu elemani 2 index
            System.out.println();
        }
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print(tablo1[satir][sutun] + "\t");
                System.out.println();
            }
        }
    }
}
