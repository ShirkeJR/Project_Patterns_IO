
package singletonio_commandio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ShirkeJR
 */
public class Bank {
    Map<Integer, Account> _mapAccounts = new HashMap<>();

    public Bank() {
        readAccounts("accounts.txt");
    }
    
    public void readAccounts(String filePath){
        
        Integer id = 0, numbetOfAccount = 0;
        float value = 0;
        try {
            File f = new File(filePath);
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                id = Integer.parseInt(sc.next());
                numbetOfAccount = Integer.parseInt(sc.next());
                value = Float.parseFloat(sc.next());    
                _mapAccounts.put(numbetOfAccount, new Account(id,numbetOfAccount,value));            
            }
            sc.close();
        } 
        catch (FileNotFoundException ex) {
            System.out.println("Problem with file");
        }
    }
    
    public void showAccounts(){
      
        for(Account a : _mapAccounts.values()){
            System.out.println(a);      
        }
    }
    
}
