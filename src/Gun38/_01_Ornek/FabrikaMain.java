package Gun38._01_Ornek;

import java.util.ArrayList;

public class FabrikaMain {
    public static void main(String[] args) {
        TeslaCar Tesla = new TeslaCar("Model 5", 310);
        ToyotaPirus Tp = new ToyotaPirus("Pirus", 1200);
        Bus Bus = new Bus("IVECO", 7000);
        ArrayList<Vehicle> araclar = new ArrayList<>();
        araclar.add(Tesla);
        araclar.add(Tp);
        araclar.add(Bus);
        for (Vehicle v : araclar){
            System.out.println("\n" + v.getClass().getSimpleName());
            System.out.println("Model = " + v.getModel());
            System.out.println("Engine = " + v.getEngine());
            if (v instanceof TeslaCar){
                System.out.println(((TeslaCar)v).changeBattery());
                System.out.println(((TeslaCar)v).drive());
            }

            if (v instanceof ToyotaPirus){
                System.out.println(((ToyotaPirus)v).changeBattery());
                System.out.println(((ToyotaPirus)v).changeOil());
                System.out.println(((ToyotaPirus)v).drive());
            }

            if (v instanceof Bus){
                System.out.println(((Bus)v).changeDiesel());
                System.out.println(((Bus)v).drive());
            }
        }
    }
}
