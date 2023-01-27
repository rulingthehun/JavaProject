package Gun31._01_StaticModifier.Ornek2;

public class Student {
    int id;
    String name;
    String surName;
    static int sayac = 1;
    //    tum nesnelere ait olan bilgiler veya sayac
//    gibi islemler icin static kullanilir
    static String school = "Gazi Mustafa Kemal Lisesi";

    public Student(String name, String surName) {
        this.id = sayac++;
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", surName = '" + surName + '\'' +
                ", school = '" + school + '\'' +
                '}';
    }
}
