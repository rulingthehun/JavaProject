package Gun39._01_Ornek;

public class OtoMain {
    public static void main(String[] args) {
        Ford fr = new Ford("Mustang", 1995, 4);
        System.out.println(fr);
        System.out.println("Hizlanma Suresi = " + fr.hizlanmaSuresi());
    }
}
