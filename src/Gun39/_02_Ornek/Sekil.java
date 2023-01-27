package Gun39._02_Ornek;

import Utility.MyFunc;

public abstract class Sekil {
    protected String name;

    public Sekil(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alan();

    public abstract double cevre();

    public void ciz() {
        System.out.println(getName() + " isimli sekil cizildi");
    }

    @Override
    public String toString() {
        return "\n Sekil Adi = " + getName() +
                "\n Alan = " + MyFunc.yuvarla(alan()) +
                "\n Cevre = " + MyFunc.yuvarla(cevre());
    }
}
