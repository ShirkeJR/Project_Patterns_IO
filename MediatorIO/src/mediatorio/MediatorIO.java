
package mediatorio;

import java.util.Vector;

public class MediatorIO {

    public static void main(String[] args) {
        ChatRoom cr = new ChatRoom();
        User u1 = new User("Janek", cr);
        User u2 = new User("Marcin", cr);
        u1.sendMessage("Hi Marcin");
        u2.sendMessage("Hey Janek");    
    }  
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
        System.out.println(u.getName() + ": " + m);
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