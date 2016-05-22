
package abstractfactoryio;

import java.util.Vector;

/**
 *
 * @author ShirkeJR
 */
public class EmployeeFactory {
    Employee e;
    
    protected Employee recruitNewEmpleyee(String role){
        Employee e = null;
        if(role.equalsIgnoreCase("Boss"))
            e = new Boss();
        else if(role.equalsIgnoreCase("Administrator"))
            e = new Administrator();
        else if(role.equalsIgnoreCase("Charwoman"))
            e = new Charwoman();
        else if(role.equalsIgnoreCase("Receptionist"))
            e = new Receptionist();
        else
            e = new Guest();
        return e;
    }
}
