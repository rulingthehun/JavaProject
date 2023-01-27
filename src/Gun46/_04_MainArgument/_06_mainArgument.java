package Gun46._04_MainArgument;

public class _06_mainArgument {
    // program calışmadan önce parameter olarak verilen
    // sayıları toplayan programı yazızını.
    public static void main(String[] args) {
        int toplam = 0;
        for (String s: args) {
            System.out.println("s = " + s);
            toplam += Integer.parseInt(s);
        }
        System.out.println("toplam = " + toplam);
    }
}
