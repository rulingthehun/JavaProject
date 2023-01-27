package Gun40._01_Ornek;

public class HayvanMain {
    public static void main(String[] args) {
        Kedi kedi = new Kedi("Sonic", false, "05.01.2021");
        System.out.println("Kedi -> " + kedi);
        kedi.yiyecegi();
        kedi.gunlukUykuSuresi();
        kedi.yemekMiktari();
        kedi.sesi();
        System.out.println("****************\n");

        Hayvan hKedi = new Kedi("Simba", false, "27.11.2022");
        System.out.println("hKedi = " + hKedi);
        System.out.println("*****************\n");

        Kartal kartal = new Kartal("Kartal", true, "26.11.2022");
        System.out.println("Kartal -> " + kartal);
        kartal.yiyecegi();
        kartal.gunlukUykuSuresi();
        kartal.yemekMiktari();
        kartal.sesi();
    }
}
