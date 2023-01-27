package Gun38._01_Ornek;

public class ToyotaPirus extends Vehicle implements IGas, IElectric{
    public ToyotaPirus(String model, double engine) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "Omur boyu kullan";
    }

    @Override
    public String changeOil() {
        return "Bir depo ile 300 km gider";
    }

    @Override
    public String drive() {
        return "Ilk 3 km elektrikle gider";
    }
}
