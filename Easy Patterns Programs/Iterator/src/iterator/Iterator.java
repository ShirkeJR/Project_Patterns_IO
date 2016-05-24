
package iterator;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList;
import java.util.List;
import java.util.Vector;

public class Iterator {

    public static void main(String[] args) {
        
    }
    
}
class Number{
    static Integer n = 0;

    public Number() {
        n++;
    }

    @Override
    public String toString() {
        return "Numbers{" + "n: " + n +'}';
    }
    
}
class Numbers{
    List<Number> l;

    public Numbers() {
        this.l = new ArrayLinkedList<>();
    }
    
    public void addItem(Number n){
        l.add(n);
    }

    public List<Number> getL() {
        return l;
    }    
}


interface Iterable{
    public boolean hasNext();
    public Object next();
}

class NumbersIterator implements Iterable{

    List<Number> l;
    int it;

    public NumbersIterator(List<Number> l) {
        this.l = l;
        it = l.
        
    }
    
    
    @Override
    public boolean hasNext() {
        if()
    }

    @Override
    public Object next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}