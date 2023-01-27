package Gun08;

public class _02_JavaArithmeticOperators {
    public static void main(String[] args) {
        int sayac = 0;
        sayac = sayac + 1; //sayacin degerini 1 artirir.
        sayac++; //sayacin degerini 1 artirir.
        ++sayac; //sayacin degerini 1 artirir.

        sayac = sayac - 1; //sayacin degerini 1 azaltir
        sayac--; //sayacin degerini 1 azaltir.
        --sayac; //sayacin degerini 1 azaltir.

        /**************/
        int sonuc = 0;
        sayac = 0;
        sonuc = sayac++; //++ veya -- ler sag tarafta ise yokmus gibi islemi yap sonra ++ veya -- yap.
        sonuc = sayac;
        sayac = sayac + 1;

        int sonuc2 = 0;
        int sayac2 = 0;
        sayac2 = 0;
        sonuc2 = ++sayac2; //++ veya -- ler sol tarafta ise once ++ veya -- yap sonra islem yap.
        sonuc2 = sayac2;
        sayac2 = sayac2 + 1;


    }
}
