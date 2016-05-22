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
public class NCcafee extends CoffeDecorator{

    public NCcafee() {
        this.name = "NC cafe";
    }
   
    @Override
    public float getCost() {
        return 2.00f;
    }
    
}
