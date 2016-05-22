
package abstractfactoryio;

/**
 *
 * @author Kuba
 */
public class AbstractFactoryIO {

    public static void main(String[] args) {    
        EmployeeFactory ef = new EmployeeFactory();
        Receptionist r = (Receptionist) ef.recruitNewEmpleyee("Receptionist");
        Boss b = (Boss) ef.recruitNewEmpleyee("Boss");
    }
    
}
