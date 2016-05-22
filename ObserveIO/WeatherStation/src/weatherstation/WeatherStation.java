
package weatherstation;

/**
 *
 * @author ShirkeJR
 */
public class WeatherStation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
       
        CurrentConditionDisplay ccd = new CurrentConditionDisplay(wd);
        
        wd.setMeasureData(21, 3, 21);
        wd.setMeasureData(11, 11, 11);
        
        CalculatorPro cp = new CalculatorPro(wd);
        
        wd.setMeasureData(0, 0, 0);
        wd.setMeasureData(12, 333, 12);
   }
    
}
