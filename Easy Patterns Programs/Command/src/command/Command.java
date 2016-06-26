package command;
import java.util.Vector;
public class Command {
    public static void main(String[] args) {
        TV tv = new TV();
        ICommand on = new TurnOnCommand(tv);
        ICommand off = new TurnOffCommand(tv);
        RemoteControl rc = new RemoteControl(on, off);
        rc.TurnOnButton();
        rc.TurnOffButton();
    }
}
class TV{
    public TV() {};
    public void turnOn(){ System.out.println("Wlaczyl sie"); }
    public void turnOff(){System.out.println("Wylaczyl sie");}
}
interface ICommand{
    void execute();
}
class TurnOnCommand implements ICommand{
    TV tv;
    public TurnOnCommand(TV tv) { this.tv = tv;}
    @Override
    public void execute() {  this.tv.turnOn(); }  
}
class TurnOffCommand implements ICommand{
    TV tv;
    public TurnOffCommand(TV tv) {   this.tv = tv;}
    @Override
    public void execute() {  this.tv.turnOff();}
}
class RemoteControl{
    ICommand oN, oFF;
    public RemoteControl(ICommand on, ICommand off) {
        this.oN = on;
        this.oFF = off;
    };
    public void TurnOnButton(){  oN.execute();}
    public void TurnOffButton(){  oFF.execute();}
}