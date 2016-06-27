class Memento {
   private String stan;
   private int licznik;
    public Memento(String stan, int licznik){
      this.stan = stan;
      this.licznik = licznik;
    }
    public String getStan() {
        return stan;
    }
    public int getLicznik() {
        return licznik;
    }
}
class Maszyna{
    private static int licznik = 0;
    private String stan;
    public Maszyna(String stan) {
        this.stan = stan;
    }
    public void setStan(String stan) {
        this.stan = stan;
        this.licznik++;
    }
    public String getStan() {
        return stan;
    }
    public static int getLicznik() {
        return licznik;
    }
    public Memento zapiszDoMemento(){
        return new Memento(stan, licznik);
    }
    public void wczytajZMemento(Memento m){
        stan = m.getStan();
        licznik = m.getLicznik();
    }  
}
class Server{
    private List<Memento> v = new ArrayList<>();
    public void dodajMemento(Memento m){
        v.add(m);
    }
    public Memento pobierzMemento(int index){
        return v.get(index);
    }
}
public static void main(String[] args) {
    Maszyna m = new Maszyna("Praca");
    Server s = new Server();
    m.setStan("Przerwa");
    m.setStan("Praca x2");
    s.dodajMemento(m.zapiszDoMemento());
    m.setStan("Praca x3");
    m.setStan("Przerwaa");
    m.setStan("Praca x4");
    s.dodajMemento(m.zapiszDoMemento());
    m.setStan("Praca x5");
    System.out.println(m.getStan() + " " + m.getLicznik());
    m.wczytajZMemento(s.pobierzMemento(0));
    System.out.println(m.getStan() + " " + m.getLicznik());    
}
########################################################################
############################### VISITATOR ##############################
public static void main(String[] args) {
	ComputerPart computer = new Computer();
    computer.accept(new ComputerPartDisplayVisitor());
}
interface IVisitator {
	public void visit(Odwiedzony1 o);
}
interface IOdwiedzony {
   public void accept(IVisitator vis);
}
class Odwiedzony1 implements IOdwiedzony {
   @Override
   public void accept(IVisitator vis) {
      vis.visit(this);
   }
}
class ListaVisitatora implements IOdwiedzony{
   Vector<IOdwiedzony> v = new Vector<>();
   public Computer(){
      v.add(new Odwiedzony1);	
   } 
   @Override
   public void accept(IVisitator vis) {
      for (int i = 0; i < parts.length; i++) {
         parts[i].accept(vis);
      }
   }
}
################################################################
########################  	STAN 	############################
public static void main(String[] args) {
    Zadania z = new Zadania();
    Po¿arStan ps = new Po¿arStan();
    ps.wykonaj(z);
    NormalnyStan ns = new NormalnyStan();
    ns.wykonaj(z);
}
interface Stan {
   void wyukonaj(Zadania z);
}
class Po¿arStan implements State {
   @Override
   public void wykonaj(Zadania z) {
      System.out.println("Gasiæ po¿ar");
      context.setState(this);	
   }
}
class NormalnyStan implements State {
   @Override
   public void wykonaj(Zadania z) {
      System.out.println("Opierdalaj sie");
      context.setState(this);	
   }
}
class Zadania {
   private Stan s;
   public Context(){
      state = new NormalnyStan();
   }
   public void setS(Stan s){
      this.state = state;		
   }
   public State getS(){
      return state;
   }
}
##############################################################################
########################	CHAIN OF RESPON	##################################
public static void main(String[] args) {
    AbstractMath loggerChain = getChainOfSymbols();
    loggerChain.Action("add", 2, 3);
    loggerChain.Action("sub", 2, 3);
    loggerChain.Action("mult", 2, 3);
}
private static AbstractMath getChainOfSymbols(){
    AbstractMath substracting = new Substracting("sub");
    AbstractMath multiplying = new Multiplying("mult");
    AbstractMath adding = new Adding("add");
    substracting.setNextSymbol(multiplying);
    multiplying.setNextSymbol(adding);
    return substracting;	
}
abstract class AbstractMath {
   protected String level;
   protected AbstractMath nextLogger;
   public void setNextSymbol(AbstractMath nextLogger){
      this.nextLogger = nextLogger;
   }
   public void Action(String level, int a, int b){
      if(this.level.equals(level)){
          System.out.println(count(a,b));
      }
      if(nextLogger !=null){
         nextLogger.Action(level, a, b);
      }
   }
  abstract protected int count(int a, int b);	
}
class Adding extends AbstractMath {
   public Adding(String level){
      this.level = level;
   }
   @Override
   protected int count(int a, int b) {		
      return a+b;
   }
}
class Substracting extends AbstractMath {
   public Substracting(String level){
      this.level = level;
   }
   @Override
   protected int count(int a, int b) {		
      return a-b;
   }
}
class Multiplying extends AbstractMath {
   public Multiplying(String level){
      this.level = level;
   }
   @Override
   protected int count(int a, int b) {		
      return a*b;
   }
}
###################################################################################
############################  MEDIATOR 	###########################################
public static void main(String[] args) {
    ChatRoom cr = new ChatRoom();
    User u1 = new User("Janek", cr);
    User u2 = new User("Marcin", cr);
    cr.addUser(u1);
    cr.addUser(u2);
    u1.sendMessage("Hi Marcin");
    u2.sendMessage("Hey Janek"); 
} 
class ChatRoom{
    Vector<User> list;
    public ChatRoom() {
        this.list = new Vector<>();
    }
    public void addUser(User u){
        list.add(u);
    }  
    public void showMessage(User u, String m){
        System.out.println("Chat Room# " + u.getName() + ": " + m);
    }
} 
class User{
    private String name;
    private ChatRoom chat;
    public User(String name, ChatRoom cr){
        this.name = name;
        this.chat = cr;
        cr.addUser(this);
    }
    public String getName() {
        return name;
    }
    public void sendMessage(String ms){
        chat.showMessage(this, ms);
    } 
}
###############################################################################################
#################################### PROXY ####################################################
public static void main(String[] args) {
    AccountGuard ag = new AccountGuard();
	ag.display();
	ag.login();
    ag.display();
} 
interface IAccount{
    void display();
}
class Account implements IAccount{
    private String login, password;
    public Account(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    @Override
    public void display() {
        System.out.println("Login: " + login + " password: " + password + " info: Witam");
    }
}
class AccountGuard implements IAccount{
    private Account acc = new Account("Janek", "zaqwsx");
	String login = "bad", password = "bad";
    @Override
    public void display() {
        if(acc.getLogin.equals(login) && acc.getPassword.equals(password)){
            acc.display();
        }
        else
            System.out.println("Wrong login or password");
    }
	public void login(String login, String password){
		this.login = login;
		this.password = password;
	}
}
##########################################################################################
###################################	FLYWEIGTH	##########################################
private static String typeOFCoffe[] = {"Sypana za 1z³", "Rozpuszczalna za 1z³", "Sypana za 3z³", "Rozpuszczalna za 4z³", "Sypana za 6z³", "Rozpuszczalna za 8z³"}; 
public static void main(String[] args) {
    Random rand = new Random();
    CoffeFactory cf = new CoffeFactory();
    for(int i = 0; i < 30; i++){
        Coffe k = (Coffe)cf.getCoffe(getRandomTypeOfCoffe());
        k.setMilk(rand.nextBoolean());
        k.setSugar(rand.nextBoolean());
        k.setSize(i);
        k.Show();
    }
}
private static String getRandomTypeOfCoffe(){
    return typeOFCoffe[(int)(Math.random()*typeOFCoffe.length)];   
}
interface Drink{
    void Show();
}
class Coffe implements Drink{
    private String type;
    private boolean sugar, milk;
    private float size;
    public Coffe(String type) {
        this.type = type;
    }
    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }
    public void setMilk(boolean milk) {
        this.milk = milk;
    }
    public void setSize(float wielkosc) {
        this.size = wielkosc;
    }
    @Override
    public void Show() {
        System.out.println("Coffe: " + "[ *type: " + type + " *sugar: " + sugar + " *milk: " + milk + " *size: " + size + "]");
    }
}
class CoffeFactory{
    private static final HashMap<String, Drink> kawaMap = new HashMap<>();
    public Drink getCoffe(String rodzaj){
        Coffe k = (Coffe)kawaMap.get(rodzaj);
        if(k == null){
            k = new Coffe(rodzaj);
            kawaMap.put(rodzaj, k);
            System.out.println("===================Adding new Coffe to Menu: " + rodzaj);
        }
        return k;
    }
}
###############################################################################
########################   BRIDGE #############################################
public static void main(String[] args) {
    Shape redCircle = new Circle(100,100, 10, new RedCircle());
    Shape greenCircle = new Circle(100,100, 10, new GreenCircle());
    redCircle.draw();
    greenCircle.draw();   
}
interface DrawAPI {
   public void drawCircle(int radius, int x, int y);
}
class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
       System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
class GreenCircle implements DrawAPI {
   @Override
   public void drawCircle(int radius, int x, int y) {
      System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
   }
}
abstract class Shape {
   protected DrawAPI drawAPI;
   protected Shape(DrawAPI drawAPI){
      this.drawAPI = drawAPI;
   }
   public abstract void draw();	
}
class Circle extends Shape {
   private int x, y, radius;
   public Circle(int x, int y, int radius, DrawAPI drawAPI) {
      super(drawAPI);
      this.x = x;  
      this.y = y;  
      this.radius = radius;
   }
   public void draw() {
      drawAPI.drawCircle(radius,x,y);
   }
}
#################################################################################################################
################################ 	COMPOSITE ###################################################################
public static void main(String[] args) {
    Menu breakfast = new Menu("Szpinaco POllo");
    Menu dinner = new Menu("Barracio0");
    Menu allMenus = new Menu("Menu");
    allMenus.add(breakfast);
    allMenus.add(dinner);
    breakfast.add(new Item("Szpinac"));
	breakfast.add(new Item("ser"));
    breakfast.add(new Item("Nuggets"));
    dinner.add(new Item("Barracio"));
    Menu desertMenu = new Menu("Deser Menu");
    desertMenu.add(new Item("Ice Cream white"));
    desertMenu.add(new Item("Ice Cream black"));
    dinner.add(desertMenu);
    allMenus.print();
}
abstract class Component{
    void add(Component menu) {};
    void remove(Component menu) {};
    abstract String getName();
    abstract void print();
};
class Item extends Component{
    String name;
    public Item(String name) {
        this.name = name;
    }    
    @Override
    public void print() {
        System.out.println("name: " + name);
    }
    @Override
    public String getName() {
        return name;
    }   
};
class Menu extends Component{
    ArrayList<Component> menuItems = new ArrayList<>();
    String name;
    public Menu(String name) {
        this.name = name;
    }
    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println("-------------");
        for(Component c : menuItems)
            c.print();
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void remove(Component menuComponent) {
        menuItems.remove(menuComponent);
    }
    @Override
    public void add(Component menuComponent) {
        menuItems.add(menuComponent);
    }  
}


