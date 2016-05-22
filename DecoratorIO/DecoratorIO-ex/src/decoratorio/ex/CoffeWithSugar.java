/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorio.ex;

/**
 *
 * @author ShirkeJR
 */
public class CoffeWithSugar extends DescriptionAbstract{

    CoffeDecorator coffe;

    public CoffeWithSugar(CoffeDecorator coffe) {
        this.coffe = coffe;
    }
    
    
    @Override
    public String getDescription() {
       return coffe.getDescription() + " :Sugar";
    }

    @Override
    public float getCost() {
        return 2.00f + coffe.getCost();
    }
    
}
