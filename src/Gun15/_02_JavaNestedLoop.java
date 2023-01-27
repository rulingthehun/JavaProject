package Gun15;

public class _02_JavaNestedLoop {
    // Aşağıdaki şekilde çıktı veren programı print içerisinde
    //            #####
    //            #####
    //            #####
    //            #####
    //            #####
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
