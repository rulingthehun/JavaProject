package Gun27._03_Ornek;

public class Person {
    String name;
    String surname;
    int age;

    void bilgiYazdir() {
        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
        System.out.println("age = " + age);
    }

    int getBirthYear() {
        return 2022 - age;
    }

    String getInitials() {
        String adIlk = name.toUpperCase().charAt(0) + "." +
                surname.toUpperCase().charAt(0) + ".";
        return adIlk;
    }
}
