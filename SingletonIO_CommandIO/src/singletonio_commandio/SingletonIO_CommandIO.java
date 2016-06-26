
package singletonio_commandio;

/**
 *
 * @author ShirkeJR
 */
public class SingletonIO_CommandIO {

    public static void main(String[] args) {
        
        Singleton s = Singleton.getInstacja();
        System.out.println(s.getWartosc());
        s.setWartosc(5);
        System.out.println(s.getWartosc());
        
    }
    
}


class Singleton{
    private int wartosc;
    private static Singleton instacja = null;
    private Singleton(){};
    
    public static synchronized Singleton getInstacja(){
        if(instacja == null)
            instacja = new Singleton();
        return instacja;
    }
    
    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }


    
}