package Gun16;

public class _06_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırnız.
        String[] kanallar = {"HBO", "BBC", "FOX", "HULU", "CNN"};
        int secilen=(int)(Math.random()*kanallar.length);
        System.out.println("kanallar = " + kanallar[secilen]);
    }
}
