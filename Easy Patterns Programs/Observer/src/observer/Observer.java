
package observer;

import java.util.Vector;

public class Observer {
    public static void main(String[] args) {
        WaterChecker wc = new WaterChecker(52.2f);
        Calculator c = new Calculator();
        wc.register(c);
        wc.setTemperature(21.5f);
    }
}

interface Subject{
    void register(WaterObserver wo);
    void notifyAllObservers();
};

class WaterChecker implements Subject{
    float temperature;
    Vector<WaterObserver> vwo;

    public WaterChecker(float temperature) {
        this.temperature = temperature;
        vwo = new Vector<>();
    }

    public void setTemperature(float temperature){
       this.temperature = temperature;
       notifyAllObservers();
    }
    
    @Override
    public void register(WaterObserver wo) {
        vwo.add(wo);
    }

    @Override
    public void notifyAllObservers() {
        for(WaterObserver o : vwo){
           o.update(temperature);
        }
    }
}

interface WaterObserver{
    void update(float temperature);
}

class Calculator implements WaterObserver{

    float temp;
    
    @Override
    public void update(float temperature) {
        this.temp = temperature;
        alert();
    }
    
    public void alert(){
        System.out.println("Allert of Temp");
    }  
}

