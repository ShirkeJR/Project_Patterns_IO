package decorator;

public class Decorator {
    public static void main(String[] args) {
            Koszyk k = null;
            k = new Pepsi(new Chleb(k));
            System.out.println(k.dodajDoKoszyka());
    }
}
abstract class Koszyk{
    Koszyk k;
    public Koszyk(Koszyk k) {
        this.k = k;
    }
    public abstract String  dodajDoKoszyka();
}

class Pepsi extends Koszyk{

    public Pepsi(Koszyk k) {
        super(k);
    }
    @Override
    
    public String dodajDoKoszyka() {
        if(k!= null)
            return this.k.dodajDoKoszyka() + " Pepsi";
        else return "Pepsi";
    }
}
class Chleb extends Koszyk{

    public Chleb(Koszyk k) {
        super(k);
    }
    
    @Override
    public String dodajDoKoszyka() {
       if(k != null)
           return this.k.dodajDoKoszyka() + " Chleb";
       else return "Chleb";
    }
    
}