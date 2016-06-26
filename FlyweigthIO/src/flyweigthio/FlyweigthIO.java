package flyweigthio;

import java.util.HashMap;
import java.util.Random;

public class FlyweigthIO {

    private static String typeOFCoffe[] = {"Sypana za 1zł", "Rozpuszczalna za 1zł", "Sypana za 3zł", "Rozpuszczalna za 4zł", "Sypana za 6zł", "Rozpuszczalna za 8zł"}; 
    
    public static void main(String[] args) {
        Random rand = new Random();
        CoffeFactory cf = new CoffeFactory();
        for(int i = 0; i < 30; i++){
            Coffe k = (Coffe)cf.getCoffe(getRandomTypeOfCoffe());
            k.setMilk(rand.nextBoolean());
            k.setSugar(rand.nextBoolean());
            k.setSize(i);
            k.Show();
        }

    }
    
    private static String getRandomTypeOfCoffe(){
        return typeOFCoffe[(int)(Math.random()*typeOFCoffe.length)];   
    }
    
}

interface Drink{
    void Show();
}

class Coffe implements Drink{
    private String type;
    private boolean sugar, milk;
    private float size;

    public Coffe(String type) {
        this.type = type;
    }
    
    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public void setSize(float wielkosc) {
        this.size = wielkosc;
    }

    @Override
    public void Show() {
        System.out.println("Coffe: " + "[ *type: " + type + " *sugar: " + sugar + " *milk: " + milk + " *size: " + size + "]");
    }
 
}

class CoffeFactory{
    private static final HashMap<String, Drink> kawaMap = new HashMap<>();
    
    public Drink getCoffe(String rodzaj){
        Coffe k = (Coffe)kawaMap.get(rodzaj);
        if(k == null){
            k = new Coffe(rodzaj);
            kawaMap.put(rodzaj, k);
            System.out.println("===================Adding new Coffe to Menu: " + rodzaj);
        }
        return k;
    }
}
/*
run:
===================Adding new Coffe to Menu: Sypana za 6zł
Coffe: [ *type: Sypana za 6zł *sugar: true *milk: false *size: 0.0]
Coffe: [ *type: Sypana za 6zł *sugar: true *milk: false *size: 1.0]
===================Adding new Coffe to Menu: Rozpuszczalna za 1zł
Coffe: [ *type: Rozpuszczalna za 1zł *sugar: false *milk: false *size: 2.0]
===================Adding new Coffe to Menu: Sypana za 1zł
Coffe: [ *type: Sypana za 1zł *sugar: true *milk: true *size: 3.0]
===================Adding new Coffe to Menu: Rozpuszczalna za 4zł
Coffe: [ *type: Rozpuszczalna za 4zł *sugar: false *milk: true *size: 4.0]
Coffe: [ *type: Sypana za 6zł *sugar: false *milk: true *size: 5.0]
Coffe: [ *type: Sypana za 6zł *sugar: false *milk: false *size: 6.0]
===================Adding new Coffe to Menu: Rozpuszczalna za 8zł
Coffe: [ *type: Rozpuszczalna za 8zł *sugar: false *milk: true *size: 7.0]
Coffe: [ *type: Rozpuszczalna za 8zł *sugar: false *milk: true *size: 8.0]
Coffe: [ *type: Rozpuszczalna za 1zł *sugar: true *milk: false *size: 9.0]
Coffe: [ *type: Sypana za 1zł *sugar: false *milk: true *size: 10.0]
Coffe: [ *type: Rozpuszczalna za 4zł *sugar: true *milk: false *size: 11.0]
Coffe: [ *type: Rozpuszczalna za 1zł *sugar: false *milk: false *size: 12.0]
Coffe: [ *type: Sypana za 6zł *sugar: false *milk: false *size: 13.0]
Coffe: [ *type: Sypana za 6zł *sugar: true *milk: true *size: 14.0]
Coffe: [ *type: Sypana za 6zł *sugar: true *milk: true *size: 15.0]
Coffe: [ *type: Rozpuszczalna za 8zł *sugar: true *milk: true *size: 16.0]
Coffe: [ *type: Sypana za 1zł *sugar: false *milk: true *size: 17.0]
Coffe: [ *type: Rozpuszczalna za 8zł *sugar: false *milk: false *size: 18.0]
Coffe: [ *type: Sypana za 1zł *sugar: false *milk: true *size: 19.0]
Coffe: [ *type: Rozpuszczalna za 1zł *sugar: true *milk: true *size: 20.0]
Coffe: [ *type: Rozpuszczalna za 8zł *sugar: true *milk: false *size: 21.0]
Coffe: [ *type: Rozpuszczalna za 4zł *sugar: false *milk: true *size: 22.0]
Coffe: [ *type: Sypana za 6zł *sugar: true *milk: false *size: 23.0]
Coffe: [ *type: Rozpuszczalna za 1zł *sugar: true *milk: true *size: 24.0]
Coffe: [ *type: Sypana za 6zł *sugar: false *milk: true *size: 25.0]
Coffe: [ *type: Sypana za 1zł *sugar: false *milk: false *size: 26.0]
Coffe: [ *type: Rozpuszczalna za 4zł *sugar: false *milk: true *size: 27.0]
===================Adding new Coffe to Menu: Sypana za 3zł
Coffe: [ *type: Sypana za 3zł *sugar: false *milk: true *size: 28.0]
Coffe: [ *type: Rozpuszczalna za 1zł *sugar: false *milk: false *size: 29.0]
BUILD SUCCESSFUL (total time: 0 seconds)
*/