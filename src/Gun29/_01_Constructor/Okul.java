package Gun29._01_Constructor;

public class Okul {
    public static void main(String[] args) {
        //1. yontem
        Student ogr1 = new Student();

        ogr1.id = 1;
        ogr1.name = "Burak";
        ogr1.surName = "Gaznepoglu";
        ogr1.classroom = 11;
        System.out.println("ogr1 = " + ogr1.name);

        //2. yontem
        Student ogr2 = new Student(1,"Mehmet", "Temur", 11);

        System.out.println("ogr2.name = " + ogr2.name);

        Student ogr3 = new Student(3, "Kim", "Wexler");
    }
}