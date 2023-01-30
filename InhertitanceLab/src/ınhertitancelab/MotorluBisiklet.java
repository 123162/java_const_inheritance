
package ınhertitancelab;

public class MotorluBisiklet extends Bisiklet {
    public int koltukYuksekligi;
    public MotorluBisiklet(int vites, int hiz,int koltukYuksekligi) {
        super(vites, hiz);
        this.koltukYuksekligi=koltukYuksekligi;
        
    }

    public int getKoltukYuksekligi() {
        return koltukYuksekligi;
    }

    public void setKoltukYuksekligi(int koltukYuksekligi) {
        this.koltukYuksekligi = koltukYuksekligi;
    }
    @Override
    public String toString(){
        return super.toString()+"koltuk yuksekligi:"+koltukYuksekligi;
    }

 
    
    
}
