package Gun30._03_Protected.iki;

import Gun30._03_Protected.bir.Doctor;

public class HastaneIstanbul {
    public static void main(String[] args) {
        Doctor dr = new Doctor("Burak");
//        Doctor dr1 = new Doctor(); defualt oldugu icin kullanilamaz
        dr.hataneAdi = "Istanbul";
    }
}
