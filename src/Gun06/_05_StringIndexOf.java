package Gun06;

public class _05_StringIndexOf {
    // Verilen karakter(ler)in string içindeki INDEX ini verir
    public static void main(String[] args) {
        String cumle = "merhaba dunya";
        System.out.println("cumle.indexOf(r) = " + cumle.indexOf("r"));
        System.out.println("cumle.indexOf(ha) = " + cumle.indexOf("ha"));
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a"));
        System.out.println("cumle.indexOf( ) = " + cumle.indexOf(" "));
        System.out.println("cumle.indexOf(A) = " + cumle.indexOf("A"));//Case sensitive oldugu icin buyuk A bulamadi
        System.out.println("cumle.indexOf(a, 7) = " + cumle.indexOf("a", 7));//7'den sonra a harfini ara
    }
}