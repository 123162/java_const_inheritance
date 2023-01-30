
package constatm;

public class Hesap {
    private String kullaniciAdi;
    private String parola;
    private int bakiye;

    public Hesap(String kullaniciAdi, String parola, int bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    Hesap() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {//mevcut bakiye öğrenme
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public void paraYatir(int tutar){
        System.out.println("yatırmak istediğiniz tutarı giriniz:"+tutar);
        bakiye+=tutar;
        System.out.println("güncel bakiyeniz:"+bakiye);
    }
    public void paraCek(int tutar){
        if(bakiye-tutar<0){
            System.out.println("yeterli bakiyeniz yok");
        }else{
            bakiye-=tutar;
            System.out.println("yeni bakiyeniz:"+bakiye);
        }
    }
}
