
package abstractfactoryio;

/**
 *
 * @author ShirkeJR
 */
public class BossFactory implements Employee{
    
    private String name;
    
    @Override
    public void addNew() {
        System.out.println("Adding new Boss named " + name);
    }
    
}
