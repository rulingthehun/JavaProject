//package Gun23;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class _04_2DArrayTODO {
//     Kullanıcıdan alınan ders notuna göre ekrana Notların Listesini bir fonksiyonda yazdırınız
//    public static void main(String[] args) {
//        Scanner intOku = new Scanner(System.in);
//        Scanner strOku = new Scanner(System.in);
//
//        ArrayList<Integer> matNotlar = new ArrayList<>();
//        ArrayList<Integer> fizNotlar = new ArrayList<>();
//        ArrayList<Integer> kimNotlar = new ArrayList<>();
//
//        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();
//        notlarListesi.add(matNotlar);
//        notlarListesi.add(fizNotlar);
//        notlarListesi.add(kimNotlar);
//
//        int matSayac = 0;
//        String matCevap;
//        do {
//            matSayac++;
//            System.out.print(matSayac + ". ogrencinin matematik notunu girin = ");
//            matNotlar.add(intOku.nextInt());
//            System.out.print("Devam etmek istiyor musunuz? E/H = ");
//            matCevap = strOku.next();
//        } while (matCevap.equalsIgnoreCase("e"));
//
//        int fizSayac = 0;
//        String fizCevap;
//        do {
//            fizSayac++;
//            System.out.print(fizSayac + ". ogrencinin fizik notunu girin = ");
//            fizNotlar.add(intOku.nextInt());
//            System.out.print("Devam etmek istiyor musunuz? E/H = ");
//            fizCevap = strOku.next();
//        } while (fizCevap.equalsIgnoreCase("e"));
//
//        int kimSayac = 0;
//        String kimCevap;
//        do {
//            kimSayac++;
//            System.out.print(kimSayac + ". ogrencinin kimya notunu girin = ");
//            kimNotlar.add(intOku.nextInt());
//            System.out.print("Devam etmek istiyor musunuz? E/H = ");
//            kimCevap = strOku.next();
//        } while (kimCevap.equalsIgnoreCase("e"));
//
//        ArrayList<Integer> notlar = new ArrayList<>();
//        notlar = notlarListesi.getClass(matSayac);
//
//
//    }
//
//    public static ArrayList<ArrayList<Integer>> notlarListesi(ArrayList<ArrayList<Integer>> notlar) {
//        ArrayList<String> dersAdlari = new ArrayList<>();
//        dersAdlari.add("Matematik");
//        dersAdlari.add("Fizik");
//        dersAdlari.add("Kimya");
//        for (int i = 0; i < notlar.size(); i++) {
//            System.out.println(dersAdlari.get(i) + " : ");
//            for (int j = 0; j < notlar.get(i).size(); j++) {
//                System.out.println(notlar.get(i).get(j) + "\t");
//            }
//            System.out.println();
//        }
//        return notlar;
//    }


//        ArrayList<Integer> tekSayilar = new ArrayList<>();
//        for (
//                int i = 0;
//                i < dizi.length; i++)
//            if (dizi[i] % 2 == 1)
//                tekSayilar.add(dizi[i]);
//        return tekSayilar;
//    }
//}
//    return ArrayList;}
//    }
//}