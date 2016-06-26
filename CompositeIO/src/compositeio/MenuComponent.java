
package compositeio;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ShirkeJR
 */
public class MenuComponent extends Menu{

    ArrayList<Menu> menuItems = new ArrayList<>();
    String name;
    String description;

    public MenuComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println("," + getDescription());
        System.out.println("-------------------------------");
        
        Iterator it = menuItems.iterator();
        while(it.hasNext()){
            Menu mc = (Menu) it.next();
            mc.print();
        }
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void remove(Menu menuComponent) {
        menuItems.remove(menuComponent);
    }

    @Override
    public void add(Menu menuComponent) {
        menuItems.add(menuComponent);
    }
    
}
