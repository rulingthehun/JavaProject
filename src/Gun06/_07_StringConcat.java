package Gun06;

public class _07_StringConcat {
    public static void main(String[] args) {
        String s1="Merhaba";
        String s2="Dunya";
        System.out.println("Birlesik hali= "+ s1+s2);
        System.out.println("Birlesik hali= "+ s1.concat(s2));
        System.out.println("Birlesik hali= "+ s1.concat(" ").concat(s2));
        System.out.println("Birlesik hali= "+ s1.concat(" "+s2));
    }
}
