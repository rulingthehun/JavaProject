package Gun30._03_Protected.bir;

public class Doctor {
    protected String adi; //defualt ile ayni
    String bolumu; //defualt
    private String sicilNo; //private
    public String hataneAdi; //public
    Doctor(){ //defualt
        
    }
    public Doctor(String adi){ //public
        this.adi = adi;
    }
    public String toString(){
        return "";
    }
}
