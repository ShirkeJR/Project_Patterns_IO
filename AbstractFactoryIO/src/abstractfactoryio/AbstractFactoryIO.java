
package abstractfactoryio;

/**
 *
 * @author Kuba
 */
public class AbstractFactoryIO {

    public static void main(String[] args) {    
        EmployeeFactory ef = new EmployeeFactory();
        Employee e1 = ef.recruitNewEmpleyee("Boss");
        Employee e2 = ef.recruitNewEmpleyee("Receptionist");
        e1.showRooms();
        System.out.println("");
        e2.showRooms();
    }
    
}
