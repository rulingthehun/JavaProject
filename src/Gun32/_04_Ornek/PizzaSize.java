package Gun32._04_Ornek;

public enum PizzaSize {
    SmallPizza("1", 15, "kucukBoy"),
    MediumPizza("2-3", 20, "ortaBoy"),
    LargePizza("3-4", 25, "buyukBoy");
    final String kisiSayisi;
    final int pizzaCapi;
    final String trBoy;

    PizzaSize(String kisiSayisi, int pizzaCapi, String trBoy) {
        this.kisiSayisi = kisiSayisi;
        this.pizzaCapi = pizzaCapi;
        this.trBoy = trBoy;
    }
}
