package Gun06;

public class _10_StringEqualsIgnoreCase {
    //Equals ile ayni calisir fakat case sensitive degil
    public static void main(String[] args) {
        String s1="Merhaba";
        String s2="MERHABA";
        System.out.println("s1 equals(s2) " + s1.equals(s2));
        System.out.println("s1 equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2));
    }
}
