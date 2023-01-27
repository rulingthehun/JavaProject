package Gun06;

public class _08_StringContains {
    //contains : bir stingin icerisinde karakter(lerin var olup olmadigini)
    //boolean cinsinden soyle -> true ya da false
    public static void main(String[] args) {
        String cumle="Merhab Dunya";
        boolean varMi=cumle.contains("a");
        System.out.println("varMi = " + varMi);
        //2. yontem
        System.out.println("varMi 2= "+cumle.contains("a"));
        System.out.println("varMi 3 = " + cumle.contains("Dunya"));
        System.out.println("varMi 4 = " + cumle.contains("dunya"));
    }
}
