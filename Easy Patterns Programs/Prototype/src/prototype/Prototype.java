
package prototype;

public class Prototype {
    public static void main(String[] args) {
        Rabbit r = new Rabbit(5);
        r.setToKill(true);
        Rabbit tab[] = new Rabbit [5];
        tab[0] = r;
        for(int i=1; i<5; i++)
            tab[i] = tab[0].clone();
        for(Rabbit s : tab){
            System.out.println(s);
        }
    }
}

class Rabbit{
    int year;
    boolean toKill;

    public Rabbit(int year) {
        this.year = year;
    }
    public Rabbit(Rabbit r){
        year = r.getYear();
    }

    @Override
    public String toString() {
        return "Rabbit{" + "year=" + year + "tokill=" + toKill +'}';
    }

    public int getYear() {
        return year;
    }

    public boolean getToKill() {
        return toKill;
    }

    public void setToKill(boolean toKill) {
        this.toKill = toKill;
    }

    
    public Rabbit clone(){
        Rabbit s = new Rabbit(this);
        s.setToKill(false);
        return s;
    }
    
}