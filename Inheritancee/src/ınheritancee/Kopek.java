
package ınheritancee;

public class Kopek extends Hayvan {
    private int disSayisi;
    
    public Kopek(String isim, int kilo, int boy, int bacakSayisi,int disSayisi) {
        super(isim, kilo, boy, bacakSayisi);
        this.disSayisi=disSayisi;
    }
    @Override
    public String toString(){
        return super.toString()+"diş sayisi:"+disSayisi;
    }
    
}
