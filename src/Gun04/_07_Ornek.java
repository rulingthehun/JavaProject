package Gun04;

public class _07_Ornek {
    // String olarak verilen 2 adet bağış parasının toplamını yazıdırnız.
    public static void main(String[] args) {
        String bagis1="50";
        String bagis2="100";
        // int toplamBagis=bagis1+bagis2; string olduklari icin toplanamaz.
        System.out.println(bagis1+bagis2); //yan yana yazar 2 ayri kelime gibi dusunur.
        int intBagis1=Integer.parseInt(bagis1);
        int intBagis2=Integer.parseInt(bagis2);
        int toplamBagis= intBagis1+intBagis2;
        System.out.println("toplamBagis = " + toplamBagis); //matematiksel toplama yapar.
    }
}
