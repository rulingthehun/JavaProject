package Gun38._01_Ornek;

public class Vehicle {
    protected double engine;
    protected String model;

    public Vehicle(double engine, String model) {
        setEngine(engine);
        setModel(model);
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle { " +
                "Engine = " + getEngine() +
                ", Model = '" + getModel() + '\'' +
                " }";
    }
}
