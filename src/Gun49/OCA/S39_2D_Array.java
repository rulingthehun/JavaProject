package Gun49.OCA;

public class S39_2D_Array {
    public static void main(String[] args) {
        String shirts[][] = new String[2][2];
        shirts[0][0] ="red";
        shirts[0][1] ="blue";
        shirts[1][0] ="small";
        shirts[1][1] ="medium";

//        Option C
        for (String[] c : shirts){
            for (String s : c) {
                System.out.println(s + ":");
            }
        }
    }
//    Answer:
//    C. Option C
}
