
package commandio;

/**
 *
 * @author ShirkeJR
 */
public class CommandIO {

    public static void main(String[] args) {
        Car ccar = new Car("Mercedes");
        ICommand[] c = new ICommand[2];
        c[0] =    new StartEngineCommand(ccar);
        c[1] = new MakingNoiseCommand(ccar);
        for(ICommand a: c){
            a.execute();
        }
        
    }
    
}
