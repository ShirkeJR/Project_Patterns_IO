
package compositeio;

public class CompositeIO {
    public static void main(String[] args) {
        Menu breakfast = new MenuComponent("Szpinaco POllo", "Szpinaco + ser + nuggets");
        Menu dinner = new MenuComponent("Barracio0", "X");
        
        Menu allMenus = new MenuComponent("Menu", "All Menus");
        allMenus.add(breakfast);
        allMenus.add(dinner);
        
        breakfast.add(new MenuItem("Szpinac", "green", 4));
        breakfast.add(new MenuItem("ser", "x", 2));
        breakfast.add(new MenuItem("Nuggets", "x", 7));
        
        dinner.add(new MenuItem("Barracio", "x", 15));
        Menu desertMenu = new MenuComponent("Deser Menu", "");
        desertMenu.add(new MenuItem("Ice Cream white", "", 2));
        desertMenu.add(new MenuItem("Ice Cream black", "", 3));
        dinner.add(desertMenu);

        allMenus.print();
    }
    
}
/*
run:

Menu,All Menus
-------------------------------

Szpinaco POllo,Szpinaco + ser + nuggets
-------------------------------
name: Szpinac, description: green, price: 4.0
name: ser, description: x, price: 2.0
name: Nuggets, description: x, price: 7.0

Barracio0,X
-------------------------------
name: Barracio, description: x, price: 15.0

Deser Menu,
-------------------------------
name: Ice Cream white, description: , price: 2.0
name: Ice Cream black, description: , price: 3.0
BUILD SUCCESSFUL (total time: 0 seconds)

*/