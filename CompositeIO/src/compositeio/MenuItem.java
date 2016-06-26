
package compositeio;

/**
 *
 * @author ShirkeJR
 */
public class MenuItem extends Menu{
    String name;
    String description;
    double price;

    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }    
    
    @Override
    public void print() {
        System.out.println("name: " + name + ", description: " + description + ", price: " + price);
    }

    @Override
    public double getPrice() {
        return super.getPrice(); //To change body of generated methods, choose Tools | Templates.
    }

        @Override
    public String getDescription() {
        return super.getDescription(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
   
}
