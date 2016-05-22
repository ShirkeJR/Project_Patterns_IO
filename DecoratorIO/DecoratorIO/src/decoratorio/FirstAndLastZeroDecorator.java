
package decoratorio;

/**
 *
 * @author ShirkeJR
 */
public class FirstAndLastZeroDecorator extends RulesDecorator{

    public FirstAndLastZeroDecorator(RulesDecorator inner) {
        super(inner);
    }
   
    @Override
    public float win() {
        if(this._inner != null)
            return this._inner.win() + 100;
        else
            return 100;
    }
    
}
