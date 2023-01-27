package Gun36._01_Protected.Paket1;

public class P1Hayvan {
    public String ad; //her yerden
    int yas;  //sadece kendi paketinden
    protected String cinsi; //defualt gibi calisir, extra bir durumda diger paketlerden erisilebilir
    private String renk; //sadece kendi classindan erisilebilir

}
