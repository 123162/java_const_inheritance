
package constractor;

public class Araba {
    private int kapi;
    private int tekerlek;
    private String renk;

    public void BilgileriGoster(){
        System.out.println("kapı sayısı:"+this.kapi);
        System.out.println("tekerlek sayısı:"+this.tekerlek);
        System.out.println("renk:"+this.renk);
    }
    
    public Araba(int kapi, int tekerlek, String renk) {
        this.kapi = kapi;
        this.tekerlek = tekerlek;
        this.renk = renk;
    }
    
    public Araba(){//alttaki constactordan aldık
        this(4,4,"siyah");
    }

    public int getKapi() {
        return kapi;
    }

    public void setKapi(int kapi) {
        this.kapi = kapi;
    }

    public int getTekerlek() {
        return tekerlek;
    }

    public void setTekerlek(int tekerlek) {
        this.tekerlek = tekerlek;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
    
    
}
