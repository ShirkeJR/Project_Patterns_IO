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
public abstract class CoffeDecorator {
    protected String name = "Cofee";
    
    public String getDescription(){
        return name;
    }
    
    public abstract float getCost();
}
