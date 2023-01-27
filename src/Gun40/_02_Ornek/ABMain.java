package Gun40._02_Ornek;

public class ABMain {
    public static void main(String[] args) {
//        A a = new A();
//        System.out.println("A.mesaj = " + A.mesaj);
//
//        B b = new B(); //Mesaj burada degistirldi
//        System.out.println("B.mesaj = " + B.mesaj);
//
//        A a2 = new A();
//        System.out.println("A.mesaj = " + A.mesaj);
        
//        ***********  static olmasaydi  *************
        A a = new A();
        System.out.println("a.mesaj = " + a.mesaj);

        B b = new B();
        System.out.println("b.mesaj = " + b.mesaj);

        A a2 = new A();
        System.out.println("a2.mesaj = " + a2.mesaj);
    }
}
//Nasil cikti verir?
//Soru: Static biliyor musun?
// A.mesaj = A'dan merhaba
// B.mesaj = B'den merhaba
// A.mesaj = B'den merhaba
