
package compositeio;

/**
 *
 * @author ShirkeJR
 */
public class Waitress {
    Menu allMenus;

    public Waitress(Menu allMenus) {
        this.allMenus = allMenus;
    }

    public void print(){
        allMenus.print();
    }
}
