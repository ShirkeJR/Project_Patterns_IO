/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

import java.util.ArrayList;

/**
 *
 * @author ShirkeJR
 */
public class WeatherData implements Subject{

    private ArrayList<Observer> _observers;

    private float temp = 0, humidity = 0, pressure = 0;

    public WeatherData() {
        this._observers = new ArrayList<>();
    }
  
    @Override
    public void register(Observer o) {
        _observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int i = _observers.indexOf(o);
        if(i>=0)
            _observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : _observers){
            o.update(temp, humidity, pressure);
        }
    }
    
    public void measureChanged(){
        notifyObservers();
    }
    
    public void setMeasureData(float temp,float humidity,float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measureChanged();
    }
    
}
