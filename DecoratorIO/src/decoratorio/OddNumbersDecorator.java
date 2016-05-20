package decoratorio;

/**
 *
 * @author ShirkeJR
 */
public class OddNumbersDecorator extends RulesDecorator {

    public OddNumbersDecorator(RulesDecorator inner) {
        super(inner);
    }

    @Override
    public float win() {
        if (this._inner != null) 
            return this._inner.win() + 50;
        else 
            return 50;
        
    }

}
