
package constatm;

import java.util.Scanner;


public class Login {
    public  boolean login(Hesap hesap){
        Scanner sn=new Scanner (System.in);
        
        System.out.println("kullanıcı adı:");
        String kullaniciAdi=sn.nextLine();
        System.out.println("parola:");
        String parola=sn.nextLine();
        
        if (hesap.getKullaniciAdi().equals(kullaniciAdi) && hesap.getParola().equals(parola)){
            return true;
        }
        else{
            return false;
        }
        
        
    }
    
}
