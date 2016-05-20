
package strategyio;

/**
 *
 * @author ShirkeJR
 */
public class Person {
    private String name;
    private float value;
    private boolean partner;
    private int kids;
    
    public Person(String name, float value, boolean partner, int kids) {
        this.name = name;
        this.value = value;
        this.partner = partner;
        this.kids = kids;
    }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public boolean isPartner() {
        return partner;
    }

    public void setPartner(boolean partner) {
        this.partner = partner;
    }

    public int getKids() {
        return kids;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }
    
}
