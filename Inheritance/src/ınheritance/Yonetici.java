
package ınheritance;
//alt sınıf
public class Yonetici extends Calisan{
    private int sorumluKisi;
    
    public Yonetici(String isim, String departman, int maas) {
        super(isim, departman, maas);
        this.sorumluKisi=sorumluKisi;
    }
    public void zamYap(int zamMiktarı){
        System.out.println("çalışanlara "+zamMiktarı+"lira zam yapıldı");
    }
    @Override
    public String toString(){
        return super.toString()+" sorumlu kisi: "+sorumluKisi;
    }
}
