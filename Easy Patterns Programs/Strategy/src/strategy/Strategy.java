
package strategy;

public class Strategy {
    public static void main(String[] args) {
        ShowSmth ss = new ShowSmth("AnyOne", new ShowFirstIndexStrategy());
        ss.show();
        ss.setStrategy(new ShowLastIndexStrategy());
        ss.show();
    }
}
abstract class ShowStrategy{
    public abstract void show(String s);
}
class ShowFirstIndexStrategy extends ShowStrategy{
    @Override
    public void show(String s) {
        System.out.println(s.charAt(0));
    } 
}
class ShowLastIndexStrategy extends ShowStrategy{
    @Override
    public void show(String s) {
        System.out.println(s.charAt(s.length()-1));
    }
}

class ShowSmth{
    String _smth;
    ShowStrategy _strategy;
    public ShowSmth(String _smth, ShowStrategy _strategy) {
        this._smth = _smth;
        this._strategy = _strategy;
    }
    public void setStrategy(ShowStrategy _strategy) {
        this._strategy = _strategy;
    }
    public void show(){
        _strategy.show(_smth);
    }
} 