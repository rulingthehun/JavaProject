package Gun27._03_Ornek;

public class Sirket {
    // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
    // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
    // 3- Adım : Bu degerlerı yazıdırınız.
    // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
    //           çalıştığında kişinin doğum yılını versin.
    // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
    //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.

    public static void main(String[] args) {
        Person personel1 = new Person();
        personel1.name = "Rhea";
        personel1.surname = "Seehorn";
        personel1.age = 50;

        Person personel2 = new Person();
        personel2.name = "Bryan";
        personel2.surname = "Cranston";
        personel2.age = 66;

//        1. yontem
        System.out.println("personel1.name = " + personel1.name);
        System.out.println("personel1.surname = " + personel1.surname);
        System.out.println("personel1 = " + personel1.age);

        System.out.println("personel2.name = " + personel2.name);
        System.out.println("personel2.surname = " + personel2.surname);
        System.out.println("personel2.age = " + personel2.age);

//        2. yontem
        bilgiYazdir(personel1);
        bilgiYazdir(personel2);

//        3. yontem -> en iyi yontem, ilgili metodu classa at
        personel1.bilgiYazdir();
        personel2.bilgiYazdir();

        System.out.println("personel1 = " + personel1.getBirthYear());
        System.out.println("personel2.getBirthYear() = " + personel2.getBirthYear());

        System.out.println("personel1.getInitials() = " + personel1.getInitials());
        System.out.println("personel2.getInitials() = " + personel2.getInitials());
    }

    public static void bilgiYazdir(Person p) {
        System.out.println("p.name = " + p.name);
        System.out.println("p.surname = " + p.surname);
        System.out.println("p.age = " + p.age);
    }
}
