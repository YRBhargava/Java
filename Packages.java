import bank.*;
//import bank.Bank.Account;
import newPackage.*;
//import newPackage.NewPackage.*;
public class Packages {
    public static void main(String[] args) {
        System.out.println("hi");
        bank.Bank ac1= new bank.Bank();
        ac1.name="pnb";    
        System.out.println(ac1.name);
        newPackage.NewPackage.Account acc1 = new newPackage.NewPackage.Account();
        acc1.name="pnb";
        acc1.setEmail("abc.com");
        acc1.setPassword("hiho321");
        System.out.println(acc1.name);
        System.out.println(acc1.getEmail());
        System.out.println(acc1.getPassword());    
    }
}
