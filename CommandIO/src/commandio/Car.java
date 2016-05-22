/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandio;

/**
 *
 * @author ShirkeJR
 */
public class Car {

    String type;
    public Car(String type) {
        this.type = type;
    }

    void makeNoise(){
        System.out.println("Making Noise!!1");
    }
    
    void startEngine(){
        System.out.println("Starting!!");
    }
    
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
