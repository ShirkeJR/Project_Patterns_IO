/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

/**
 *
 * @author ShirkeJR
 */
public class CalculatorPro implements Observer, DisplayElement{
    
    private float temp = 0, humidity = 0, pressure = 0;
    private Subject s;
    
    public CalculatorPro(Subject s) {
        this.s = s;
        s.register(this);
    }
    
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CalculatorPro{" + "temp=" + temp + ", humidity=" + humidity + ", pressure=" + pressure + ", s=" + s + '}';
    }

   
    
    
}
