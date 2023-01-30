
package consractor1;

public class Account {
    private String hesapno;
    private double bakiye;
    private String isim;
    private String email;
    private String telefon;

    public Account(String hesapno, double bakiye, String isim, String email, String telefon) {
        this.hesapno = hesapno;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefon = telefon;
    }
    public Account(){
        System.out.println("kendi yazdığımız constactor");
    }
    
    
    
    public void paraYatır(double miktar){
        bakiye+=miktar;
        System.out.println("Güncel bakiye:"+bakiye);
    }
    public void paraCekme(double miktar){
        if(miktar>1500){
           System.out.println("para miktarı çok fazla ");
        }if(bakiye-miktar<0){
           System.out.println("para miktarı çok fazla,bakiye :"+bakiye); 
        }else{
            bakiye-=miktar;
            System.out.println("para miktarı :"+bakiye);
        }
    }
    public String getHesapno() {
        return hesapno;
    }

    public void setHesapno(String hesapno) {
        this.hesapno = hesapno;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
    
    
}
