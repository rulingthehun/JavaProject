package Gun30._02_PrivateErisim;

public class Calisan {
    int id;
    String name;
    String surName;

    private String password;

    public void sifreAta(String sifre) {
        if (sifre.length() >= 8) {
            this.password = sifre;
            System.out.println("Sifre atama basarili");
        } else
            System.out.println("Sifre kurala uygun degil");
    }

    public String sifreGoster() {
        return "****" + password.substring(4);
    }
}
