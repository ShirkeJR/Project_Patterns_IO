
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
    private float rentForHouse;
    TypeOfPersonStrategy typeOfPerson;
    
    public Person(String name, float value, boolean partner, int kids, float rentForHouse, TypeOfPersonStrategy typOfPerson) {
        this.name = name;
        this.value = value;
        this.partner = partner;
        this.kids = kids;
        this.rentForHouse = rentForHouse;
        this.typeOfPerson = typOfPerson;
    }
  
    public float calculateTax(){
        float value = rentForHouse;
        value += typeOfPerson.SettleTax(value);
       
        if(typeOfPerson instanceof IndividualPersonStrategy){
            if(partner){
                value += kids * 500;
                return value > 20000f ? 20000f : value;
            }        
            return value > 10000f ? 10000f : value;
        }
        else
            return value > 15000f ? 15000f : value;
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
