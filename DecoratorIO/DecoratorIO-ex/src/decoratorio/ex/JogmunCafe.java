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
public class JogmunCafe extends CoffeDecorator{

    public JogmunCafe() {
        this.name = "Jogmun Cafe";
    }

    
    
    @Override
    public float getCost() {
        return 5.00f;
    }
    
}
