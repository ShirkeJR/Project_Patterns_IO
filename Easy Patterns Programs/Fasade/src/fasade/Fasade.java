package fasade;
public class Fasade {
    public static void main(String[] args) {
        ClassFasade cf = new ClassFasade();
        cf.useClass12();
        cf.useClass23();
    }
}
class Class1{
    public void doSmth(){
        System.out.println("Class1 is doing smth");
    }
}
class Class2{
    public void doSmth(){
        System.out.println("Class2 is doing smth");
    }
}
class Class3{
    public void doSmth(){
        System.out.println("Class3 is doing smth");
    }
}
class ClassFasade{
    Class1 c1;
    Class2 c2;
    Class3 c3;
    public ClassFasade() {
        this.c1 = new Class1();
        this.c2 = new Class2();
        this.c3 = new Class3();
    }
    public void useClass12(){
        c1.doSmth();
        c2.doSmth();
    }
    public void useClass23(){
        c2.doSmth();
        c3.doSmth();
    }  
}