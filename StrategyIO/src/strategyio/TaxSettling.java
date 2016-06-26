/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyio;

/**
 *
 * @author ShirkeJR
 */
public class TaxSettling {
    
    private TaxSettling inner = null;
    private TaxSettling() {};
  
    public TaxSettling getInstance(){
        if(inner == null)
            return new TaxSettling();
        else
            return inner;
    }
}
