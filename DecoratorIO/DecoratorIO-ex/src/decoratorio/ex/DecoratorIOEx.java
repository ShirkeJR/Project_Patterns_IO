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
public class DecoratorIOEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CoffeDecorator coffe = new JogmunCafe();
       coffe = new CoffeWithMilk(coffe);
       coffe = new CoffeWithSugar(coffe);
        System.out.println(coffe.getDescription());
        System.out.println(coffe.getCost());
        
    }
    
}
