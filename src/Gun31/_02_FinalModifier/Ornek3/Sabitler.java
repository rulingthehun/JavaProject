package Gun31._02_FinalModifier.Ornek3;

public class Sabitler {
    final static int gundeSaat = 24;
    final static int saatteDakika = 60;
    final static int dakikadaSaniye = 60;

    public static int toSecond(int gun, int saat, int dakika){
        int toplamSaniye= gun * Sabitler.gundeSaat *
                Sabitler.saatteDakika * Sabitler.dakikadaSaniye +
                saat * Sabitler.saatteDakika *
                        Sabitler.dakikadaSaniye +
                dakika * Sabitler.dakikadaSaniye;
    return  toplamSaniye; }
}
