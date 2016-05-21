
package abstractfactoryio;

import java.util.Vector;

/**
 *
 * @author ShirkeJR
 */
public abstract class EmployeeFactory {
    
    private Employee employee;
    
    
        
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
}
