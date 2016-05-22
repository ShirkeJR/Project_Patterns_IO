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
public class CoffeWithMilk extends DescriptionAbstract{

    CoffeDecorator coffe;

    public CoffeWithMilk(CoffeDecorator coffe) {
        this.coffe = coffe;
    }
    
    
    @Override
    public float getCost() {
        return 1.00f + coffe.getCost();
    }

    @Override
    public String getDescription() {
        return coffe.getDescription() + " :Milk";
    }
    
}
