
package singletonio_commandio;

/**
 *
 * @author ShirkeJR
 */
public class Account {
    int _id;
    int _numberOfAccount;
    float _value;

    public Account(int _id, int _numberOfAccount, float _value) {
        this._id = _id;
        this._numberOfAccount = _numberOfAccount;
        this._value = _value;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public int getNumberOfAccount() {
        return _numberOfAccount;
    }

    public void setNumberOfAccount(int _numberOfAccount) {
        this._numberOfAccount = _numberOfAccount;
    }

    public float getValue() {
        return _value;
    }

    public void setValue(float _value) {
        this._value = _value;
    }

    @Override
    public String toString() {
        return "Account{" + "_id=" + _id + ", _numberOfAccount=" + _numberOfAccount + ", _value=" + _value + '}';
    }
    
}
