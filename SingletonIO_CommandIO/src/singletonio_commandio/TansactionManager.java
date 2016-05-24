
package singletonio_commandio;

import java.util.Map;

/**
 *
 * @author ShirkeJR
 */
public class TansactionManager {
    Map<Integer, Account> _mapAccounts;
    TransactionsSingleton transactions;

    public TansactionManager(Map<Integer, Account> _mapAccounts) {
        this._mapAccounts = _mapAccounts;
        transactions = TransactionsSingleton.getInstance();
    }
     
    public void redeemTransaction(){
        
    }
        
    
}
