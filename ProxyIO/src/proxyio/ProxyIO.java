
package proxyio;

public class ProxyIO {
    public static void main(String[] args) {
        AccountGuard ag = new AccountGuard(new Account("Jan", "zaqwsx", 500d));
        ag.display();
        ag.showAll();
        ag.login("Jan", "zaqwsx");
        ag.display();
        ag.showAll();
        ag.setValue(1000d);
        ag.display();
        ag.logout();
        ag.display();
        ag.showAll();
    } 
}

interface IAccount{
    void display();
}

class Account implements IAccount{
    
    private String login, password;
    private Double value;

    public Account(String login, String password, Double value) {
        this.login = login;
        this.password = password;
        this.value = value;
    }

    
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    
    @Override
    public void display() {
        System.out.println("Login: " + login + " password: " + password + " value: " + value);
    }
}

class AccountGuard implements IAccount{

    private Account acc;
    private boolean activate;
    
    public AccountGuard(Account acc) {
        this.acc = acc;
        activate = false;
    }
    
    public void login(String login, String password){
        if(activate) return;
        if(login == acc.getLogin() && password == acc.getPassword()){
            System.out.println("You are logged on acccout: " + acc.getLogin());
            activate = true;
        }
    }
    
    public void logout(){
        if(!activate) return;
        System.out.println("Logout from " + acc.getLogin());
        activate = false;
    }
    
    void setValue(Double value){
        if(activate) acc.setValue(value);
        else System.out.println("You dont have permission");
    }
    
    void showAll(){
        if(activate) acc.display();
        else System.out.println("You dont have permission");
    }
    
    @Override
    public void display() {
        System.out.println("Account Guard of + " + acc.getLogin() + "Activate: " + activate);
    }    
}
