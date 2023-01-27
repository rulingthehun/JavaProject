package Gun38._01_Ornek;

public class Bus extends Vehicle implements IDiesel{
    public Bus(String model, double engine) {
        super(engine, model);
    }

    @Override
    public String changeDiesel() {
        return "Bir depo 1000 km gider.";
    }

    @Override
    public String drive() {
        return "Sehir icine girme, yavas sur";
    }
}
