
package decoratorio;

/**
 *
 * @author ShirkeJR
 */
public class MoreThanSevenDecorator extends RulesDecorator{

    public MoreThanSevenDecorator(RulesDecorator inner) {
        super(inner);
    }

    @Override
    public float win() {
        if(this._inner != null)
            return this._inner.win() + 150;
        return 150;
    }
    
}
