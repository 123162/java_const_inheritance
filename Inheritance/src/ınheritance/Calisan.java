
package ınheritance;
//ana clas
public class Calisan {
    private String isim;
    private String departman;
    private int maas;

    public Calisan(String isim, String departman, int maas) {
        this.isim = isim;
        this.departman = departman;
        this.maas = maas;
    }
    public void calis(){
        System.out.println("çalışan çalışıyor...");
    }
    public void BilgileriGoster(){
        System.out.println("ismi:"+this.isim);
        System.out.println("departman:"+this.departman);
        System.out.println("maas:"+this.maas);        
    }
    public void departmanDegis(String yenidepartman){
        System.out.println("departman değşiyor...");
        this.departman=yenidepartman;
        System.out.println("yeni departman:"+this.departman);
        
    }
    @Override
      public String toString(){
          return("isim: "+ isim + "departman: " + departman + "maas: " + maas );
          
      }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }
      
}
