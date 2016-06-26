
package builder;

/**
 *
 * @author ShirkeJR
 */
public class Builder {

    public static void main(String[] args) {
        MealBuilder mb = new ItaliaMealBuilder();
        MealDirector md = new MealDirector(mb);
        md.ConstructMeal();
        System.out.println(md.getMeal());
    }
}

class Meal{
    String drink;
    String mainCourse;

    public String getDrink() {
        return drink;
    }
    public void setDrink(String drink) {
        this.drink = drink;
    }
    public String getMainCourse() {
        return mainCourse;
    }
    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }  

    @Override
    public String toString() {
        return "Meal{" + "drink=" + drink + ", mainCourse=" + mainCourse + '}';
    }
    
}

interface MealBuilder{
    public void makeDrink();
    public void makeMainCourse();
    public Meal getMeal();
}

class ItaliaMealBuilder implements MealBuilder{

    private Meal m;

    public ItaliaMealBuilder(){
        this.m = new Meal();
    }
    
    @Override
    public void makeDrink() {
        m.setDrink("red wine");
    }

    @Override
    public void makeMainCourse() {
        m.setMainCourse("pizza");
    }

    @Override
    public Meal getMeal() {
        return m;
    }
}

class MealDirector {
    MealBuilder mb = null;

    public MealDirector(MealBuilder mb) {
        this.mb = mb;
    }
    public void ConstructMeal(){
        mb.makeDrink();
        mb.makeMainCourse();
    }
    public Meal getMeal(){
        return mb.getMeal();
    }
} 