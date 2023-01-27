package Gun31._02_FinalModifier.Ornek1;


public class School {
    public static void main(String[] args) {
        Student std1 = new Student("Burak Gaznep");
        Student std2 = new Student("Mert Gunhan");
        Student std3 = new Student("Tancan Fumen");
        Student std4 = new Student("Can Sungur");
        Student std5 = new Student("Yigitcan Erdogan");
        System.out.println("std1 = " + std1); //id = 1
        System.out.println("std2 = " + std2); //id = 2
        System.out.println("std3 = " + std3); //id = 3
        System.out.println("std4 = " + std4);
        System.out.println("std5 = " + std5);
        System.out.println("Student.sayac = " + (Student.sayac - 1));
//        private: erisimi engeller ama class dan erisilebilir
//        final: degerin BIR KEZ atandiktan sonra degistirilememisini saglar
//        final degiskenler deger ilk tanimlandiginda veya
//        CONSTRUCTOR da degistirilebilir
    }
}
