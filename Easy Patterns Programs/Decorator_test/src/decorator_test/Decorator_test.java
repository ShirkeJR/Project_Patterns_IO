
package decorator_test;


public class Decorator_test {

    public static void main(String[] args) {
        Koszyk k = null;
        k = new Mleko(new Pepsi(k));
        System.out.println(k.getProducts());
        System.out.println(k.getCost());
        A a = new A();
        
    }
}

class A{
    int a = 5;
    public A(int a) { this.a = a; }
}


abstract class Koszyk{
    Koszyk k = null;

    public Koszyk(Koszyk k) {
        this.k = k;
    }
    
    public abstract int getCost();
    public String getProducts(){
        if(k== null) return "Koszyk: ";
        else return this.k.getProducts() + "Koszyk: ";
    }
}

class Mleko extends Koszyk{
    public Mleko(Koszyk k) {
        super(k);
    }
    @Override
    public int getCost() {
        if(k!=null)
            return this.k.getCost() + 5;
        else return 5;
    }
    @Override
    public String getProducts(){
        if(k== null) return " mleko,";
        else return this.k.getProducts() + " mleko,";
    }
    
}

class Pepsi extends Koszyk{
    public Pepsi(Koszyk k) {
        super(k);
    }
    @Override
    public int getCost() {
        if(k!=null)
            return this.k.getCost() + 10;
        else return 10;
    }
    @Override
    public String getProducts(){
        if(k== null) return " pepsi,";
        else return this.k.getProducts() + " pepsi,";
    }
}