
package decoratorio;

import javafx.beans.binding.Bindings;

/**
 *
 * @author ShirkeJR
 */
public class DecoratorIO {

    public static void main(String[] args) {
        RulesDecorator tabRules = null;
        
        int[] tab = {0, 3, 5, 7, 9, 15, 21, 0};
        
        boolean odd = true;
        for(int i=0; i < tab.length; i++){
            odd &= (tab[i] % 2 == 0);
        }
        
        if(odd)
            tabRules = new OddNumbersDecorator(tabRules);
        if(tab[0] == 0 && tab[tab.length-1] == 0)
            tabRules = new FirstAndLastZeroDecorator(tabRules);
        if(tab.length > 7)
            tabRules = new MoreThanSevenDecorator(tabRules);
        
        System.out.println(tabRules.win());
    }
    
}
