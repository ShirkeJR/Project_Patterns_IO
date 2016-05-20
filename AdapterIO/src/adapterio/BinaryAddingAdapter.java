
package adapterio;

/**
 *
 * @author ShirkeJR
 */

public class BinaryAddingAdapter implements AddingUpInterface{

    @Override
    public int AddTwoBinaryNumbers(int a, int b) {
        int i, j;
        BinaryStringAdding binaryAdder = new BinaryStringAdding();

        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        
        String stringResult = binaryAdder.AddTwoBinaryStrings(s1, s2);
        int intResult = Integer.parseInt(stringResult);

        return intResult;
    } 
}
