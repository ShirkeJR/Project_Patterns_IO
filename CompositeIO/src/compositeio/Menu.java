
package compositeio;

/**
 *
 * @author ShirkeJR
 */
public abstract class Menu {
    
    public void add(Menu menuComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(Menu menuComponent){
        throw new UnsupportedOperationException();
    }
    public String getName(){
        throw new UnsupportedOperationException();
    }
    public String getDescription(){
        throw new UnsupportedOperationException();
    }
    public double getPrice(){
        throw new UnsupportedOperationException();
    }
    public void print(){
        throw new UnsupportedOperationException();
    }
}
