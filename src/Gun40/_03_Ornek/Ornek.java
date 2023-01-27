package Gun40._03_Ornek;

class C{
    public C() { System.out.println("C "); }
}

class B extends C{
    public B(){
//        super();
        System.out.println("B ");
    }
}

class A extends B{
    public A(){
//        super();
        System.out.println("A ");
    }
}
public class Ornek {
    public static void main(String[] args) {
        A a = new A(); //main calistirildiginda Inheritance sayesinde tum class lar yazdirildi
    }
}
