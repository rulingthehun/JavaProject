package Gun29._01_Constructor;

public class Student {

    int id;

    String name;

    String surName;

    int classroom;

    Student() { //Constructor - Yapici metodlar
        System.out.println("Nesne olusturuldu");
    } //Nesne olustulurken yapmak istediklerin icin burayi kullan

    Student(int id, String name, String surName, int classroom) {
        this.id = id; // this.id : Class'in ID si
        this.name = name;
        this.surName = surName;
        this.classroom = classroom;
    }

    //    Student(int id, String name, String surName) {
//        this.id = id; // this.id : Class'in ID si
//        this.name = name;
//        this.surName = surName;
//        this.classroom = 0;
//    }
    Student(int id, String name, String surName) {
        this(id, name, surName, 0);
    }

    Student(int id, String name) {
        this(id, name, "", 0);
    }
}
