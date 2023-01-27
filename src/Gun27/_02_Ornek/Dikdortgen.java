package Gun27._02_Ornek;

public class Dikdortgen {
    //Ozellikleri, fields
    int kisaKenar;
    int uzunKenar;

    //methods
    int cevre() {
        return (kisaKenar + uzunKenar) * 2;
    }

    int alan() {
        return uzunKenar * kisaKenar;
    }
}
