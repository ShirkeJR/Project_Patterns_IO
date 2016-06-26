
package singletonio_commandio;

/**
 *
 * @author ShirkeJR
 */
public class Transaction {
    int _accountNrSource;
    int _accountNrDestiny;
    float _value;

    public Transaction(int _accountNrSource, int _accountNrDestiny, float _value) {
        this._accountNrSource = _accountNrSource;
        this._accountNrDestiny = _accountNrDestiny;
        this._value = _value;
    }

    void redeemTransaction(){
        
    }
    
    public int getAccountNrSource() {
        return _accountNrSource;
    }

    public void setAccountNrSource(int _accountNrSource) {
        this._accountNrSource = _accountNrSource;
    }

    public int getAccountNrDestiny() {
        return _accountNrDestiny;
    }

    public void setAccountNrDestiny(int _accountNrDestiny) {
        this._accountNrDestiny = _accountNrDestiny;
    }

    public float getValue() {
        return _value;
    }

    public void setValue(float _value) {
        this._value = _value;
    }

    @Override
    public String toString() {
        return "Transaction{" + "_accountNrSource=" + _accountNrSource + ", _accountNrDestiny=" + _accountNrDestiny + ", _value=" + _value + '}';
    }
    
    
}
