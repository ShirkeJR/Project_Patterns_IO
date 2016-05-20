package adapterio;

import javax.swing.JOptionPane;

/**
 *
 * @author ShirkeJR
 */
public class AdapterIO {

    public static void main(String[] args) {
        BinaryAddingAdapter baa = new BinaryAddingAdapter();
        int a = Integer.parseInt(JOptionPane.showInputDialog("First binary number"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Seconf binary number"));
        int c = baa.AddTwoBinaryNumbers(a, b);
        System.out.println("Sum of " + a + " + " + b + " = " + c);
    }
    
}
