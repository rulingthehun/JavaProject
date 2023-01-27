package Gun06;

public class _12_StringLastIndexOf {
    public static void main(String[] args) {
        //indexOf gibi calisir bu aramaya bastan baslar
        //lastIndexOf ise aramaya sondan baslar
        String s1="Merhaba";
        System.out.println("Bastan arma ile a'nin indexi = " + s1.indexOf("a")); //4
        System.out.println("Sondan basa dogru a'yi arar = " + s1.lastIndexOf("a")); //6
    }
}
