package adapter;
public class Adapter {
    public static void main(String[] args) {
        ShowAdapter sa = new ShowAdapter(5);
        sa.show();
    }  
}
interface ShowSmth{
    public void show();
}
class Square{
    int a;
    public Square(int a) {this.a = a; }
    public int CountCircuit(){
        return a*a;
    }
}
class ShowAdapter extends Square implements ShowSmth{
    public ShowAdapter(int a) {
        super(a);
    }
    @Override
    public void show() {
        System.out.println(CountCircuit());
    }  
}