
package abstractfactory;

public class AbstractFactory {

    public static void main(String[] args) {
        AnimalAbstractFactory af = new AnimalAbstractFactory();
        SpeciesFactory sf = af.getFactory("Cat");
        Animal a[] = new Animal [3];
        a[0] = sf.getAnimal("Stefan");
        a[1] = sf.getAnimal("Janek");
        sf = af.getFactory("Dog");
        a[2] = sf.getAnimal("Stefan");
        for(Animal aa : a){
            aa.makeNoise();
        }
    }
    
}

abstract class Animal{
    String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + '}';
    }
    
    
    public abstract void makeNoise();
}
class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    
    @Override
    public void makeNoise() {
        System.out.println(super.toString());
        System.out.println("HAUHAUAHHAU");
    }
}

class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void makeNoise() {
        System.out.println(super.toString());
        System.out.println("MIAUMIAUMAIU");
    }
}

class AnimalAbstractFactory{
    public SpeciesFactory getFactory(String type){
        if(type.equals("Cat"))
            return new CatFactory();
        else
            return new DogFactory();
    }
}

abstract class SpeciesFactory{
    public abstract Animal getAnimal(String name);
}

class CatFactory extends SpeciesFactory{

    @Override
    public Animal getAnimal(String name) {
        if(name.equals("Stefan"))
            return new Cat(name);
        else
            return new Cat(name);
    }
}

class DogFactory extends SpeciesFactory{

    @Override
    public Animal getAnimal(String name) {
       if(name.equals("Stefan"))
           return new Dog(name);
       else
           return new Dog(name);
    }
}

