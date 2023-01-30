
package consractor1;

public class Consractor1 {

    public static void main(String[] args) {
       //Account account1=new Account();
        
        
        /*account1.setBakiye(1000.0);
        account1.setEmail("senlik143@gmail.com");
        account1.setHesapno("12345");
        account1.setIsim("rabia");
        account1.setTelefon("5334785704");
        
        System.out.println("bakiye:"+account1.getBakiye());
        System.out.println("email:"+account1.getEmail());
        System.out.println("hesapno:"+account1.getHesapno());
        System.out.println("isim:"+account1.getIsim());
        System.out.println("telefon:"+account1.getTelefon());*/
       
       //constractur sayesinde yukarıdaki gbi tek tek yazmamıza gerek yok
       
       
       Account account2=new Account("12345",1500,"rabia","senlik143@gmail.com","5334785704");
       account2.paraCekme(47);
    }
    
}
