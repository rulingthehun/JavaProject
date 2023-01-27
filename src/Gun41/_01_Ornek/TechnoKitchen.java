package Gun41._01_Ornek;

import Utility.MyFunc;

public class TechnoKitchen {
    public static void hazirla(IFood food) {
        MyFunc.Bekle(2);
        if (food instanceof Adana_Kebap) {
            ((Adana_Kebap) food).marinade();
            MyFunc.Bekle(2);
            System.out.println("Adana kebap hazirlanmaya basladi!");
            System.out.println("*************");
            ((Adana_Kebap) food).grill();
            System.out.println("*************");
            MyFunc.Bekle(2);
            System.out.println("Adana kebap hazir...");
            food.taste();
            System.out.println();
            System.out.println();
        }

        if (food instanceof Lahmacun) {
            MyFunc.Bekle(2);
            System.out.println("Lahmacun hazirlanmaya basladi!");
            ((Lahmacun) food).dough();
            System.out.println("*************");
            MyFunc.Bekle(2);
            ((Lahmacun) food).addMeat();
            System.out.println("*************");
            MyFunc.Bekle(2);
            ((Lahmacun) food).bake();
            System.out.println("*************");
            MyFunc.Bekle(2);
            System.out.println("Lahmacun hazir...");
            food.taste();
            System.out.println();
            System.out.println();
        }

        if (food instanceof Borsh) {
            MyFunc.Bekle(2);

            System.out.println("Borsh hazirlanmaya basladi!");
            ((Borsh) food).boil();
            System.out.println("*************");
            MyFunc.Bekle(2);
            ((Borsh) food).eatTomorrow();
            System.out.println("*************");
            MyFunc.Bekle(2);
            System.out.println("Borsh hazir...");
            food.taste();
            System.out.println();
            System.out.println();
        }

        if (food instanceof Palov) {
            MyFunc.Bekle(2);
            System.out.println("Palov hazirlanmaya basladi!");
            ((Palov) food).fry();
            System.out.println("*************");
            MyFunc.Bekle(2);
            ((Palov) food).boil();
            System.out.println("*************");
            MyFunc.Bekle(2);
            System.out.println("Palov hazir...");
            food.taste();
            System.out.println();
            System.out.println();
        }

    }
}
