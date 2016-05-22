
package strategyio;

/**
 *
 * @author ShirkeJR
 */
public class StrategyIO {

    public static void main(String[] args) {
        Person[] tab = new Person[5];
        tab[0] = new Person("Kuba", 66000f, true, 2, 7000f, new IndividualPersonStrategy());
        tab[1] = new Person("Janek", 48000f, true, 3, 6000f, new IndividualPersonStrategy());
        tab[2] = new Person("Michal", 24000f, false, 0, 3000f, new IndividualPersonStrategy());
        tab[3] = new Person("Maciek", 72000f, true, 0, 15000f, new ProfessionalPersonStrategy());
        tab[4] = new Person("Tomek", 22000f, false, 0, 1500f, new ProfessionalPersonStrategy());
        
        for(Person p : tab){
            System.out.println(p.calculateTax());
        }
        
    }
    
}
