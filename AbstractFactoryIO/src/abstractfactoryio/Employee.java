
package abstractfactoryio;

import java.util.Vector;

/**
 *
 * @author ShirkeJR
 */
public abstract class Employee {
    Vector<Integer> rooms;   
    public abstract void addNew();
    protected abstract void addRooms();
}
