package Gun30.Soru;

public class MusteriHesap {
    int yatanPara = 0;
    int cekilenPara = 0;
    private int hesapBakiyesi = 0;

    void paraYatir(int gelenPara){
        this.yatanPara = this.yatanPara + gelenPara;
        this.hesapBakiyesi = this.hesapBakiyesi + gelenPara;
    }
    void paraCek(int cekilenPara){
        this.cekilenPara = this.cekilenPara + cekilenPara;
        this.hesapBakiyesi = this.hesapBakiyesi - cekilenPara;
    }

    @Override
    public String toString() {
        return "MusteriHesap{" +
                "yatanPara=" + yatanPara +
                ", cekilenPara=" + cekilenPara +
                ", hesapBakiyesi=" + hesapBakiyesi +
                '}';
    }
}
