
package ınhertitancelab;


public class Bisiklet {
    public int vites;
    public int hiz;

    public Bisiklet(int vites, int hiz) {
        this.vites = vites;
        this.hiz = hiz;
    }
    public void HizArttir(int artrirmaMiktari){
        hiz+=artrirmaMiktari;
        
    }
      public void HizAzalt(int azaltmaMiktari){
        hiz+=azaltmaMiktari;
        
    }
    @Override
      public String toString(){
          return("vites:"+vites+"hiz:"+hiz);
          
      }
              

    public int getVites() {
        return vites;
    }

    public void setVites(int vites) {
        this.vites = vites;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }
    
    
}
