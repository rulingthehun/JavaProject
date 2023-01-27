package Gun03;

public class _02_JavaDataTypes {
    public static void main(String[] args) {
        int sayi; // butun tam sayilar kendi baslarinayken defualt INT gorulur
        // tam sayilar
        byte byteDeger=7; // -128 127
        short shortDeger=1645;
        int intDeger=25000;
        long longDeger=232322223223L; /*Defualt olarak tam sayilar INT kabul ettiginden
                                        sonuna L koyarak LONG oldugunu belirttik*/
        //ondalikli sayilar
        //Defualt olarak butun ondalikli sayilar DOUBLE kabul edilir
        float floatDeger= 3.140005F; //ondalikli sayilar defualt olarak DOUBLE gorundugunden
                                     //soununa F ekleyerek FLOAT oldugunu belirttik
        double doubleDeger= 3.1400000001;

        char basHarf='A'; //sayi olarak sakliyor karakter tablosuna bakarak, mesela A-> 65
        boolean evetMi=true; //sadece 2 deger alabilir: true veya false

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("evetMi = " + evetMi);
    }
}
/* byteDeger = 7
shortDeger = 1645
intDeger = 25000
longDeger = 232322223223
floatDeger = 3.140005
doubleDeger = 3.1400000001
basHarf = A
evetMi = true */
