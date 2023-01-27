package Gun06;

public class _09_StringEquals {
    public static void main(String[] args) {
        //Equals: 2 stringin birbirine esit olup olmadigini kontrol eder.
        //sonuc boolean
        String s1="Merhaba";
        String s2="MERHABA";
        boolean esitMi=s1.equals(s2); //s1 s2 ye esit mi?
        System.out.println("esitMi = " + esitMi);
        //2. yontem
        System.out.println("s1 s2'ye esit mi = " + s1.equals(s2));
        System.out.println("s1 s1'e esit mi = " + s1.equals("Merhaba"));
        System.out.println("s1 s2'ye esit mi2 = " + s1.equals("MERHABA"));
    }
}
