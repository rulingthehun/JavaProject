package Gun45._02_ExceptionHandling;

public class _01_JavaRuntimeException {
    public static void main(String[] args) {

        System.out.println("Program calismaya basladi");
        String kelime = "   ";
        char ilkHarf = kelime.charAt(3);

        System.out.println("Program bitti");
    }
}

//Daha calismadan once olusmus eksiklerden kaynakli hatalara
//Derleme zamani yani COMPILE ERROR, Exception diyoruz.

//Program calistiktan sonra calisma zamani icerisindeki hatalara
//calisma zamani yani RUNTIME ERROR, Exception diyoruz