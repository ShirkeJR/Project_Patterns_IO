
package factory;

public class Factory {

    public static void main(String[] args) {
       AnimalFactory af = new AnimalFactory();
       Animal a = af.getAnimal("Dog");
       a.makeNoise();
    }
    
}

interface Animal{
    public void makeNoise();
}

class Dog implements Animal{
    @Override
    public void makeNoise() {
        System.out.println("HAUHAUAHHAU");
    }
}

class Cat implements Animal{
    @Override
    public void makeNoise() {
        System.out.println("MIAUMIAUMAIU");
    }
}

class AnimalFactory{
    Animal a;
    public Animal getAnimal(String type){
        if(type.equals("Cat"))
            a = new Cat();
        else if(type.equals("Dog"))
            a = new Dog();
        return a;
    }
}
