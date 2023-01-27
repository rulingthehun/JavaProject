package Gun38._01_Ornek;

public class TeslaCar extends Vehicle implements IElectric{
    public TeslaCar(String model, double engine) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "Batarya 9 yil gider";
    }

    @Override
    public String drive() {
        return "Auto surus ozelligi var";
    }
}
