
package abstractfactoryio;

import java.util.Vector;

/**
 *
 * @author ShirkeJR
 */
public abstract class EmployeeFactory {
    private Employee employee;
    
    public Vector<Integer> getRooms() {
        return rooms;
    }

    public void setRooms(Vector<Integer> rooms) {
        this.rooms = rooms;
    }
        
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
}
