/**
 * Demonstrate pass-by-reference-by-value behavior of Java.
 * Unlike C++, Java can only pass by value, but passes only
 * the reference, not a copy of an object
 */

public class StackVsHeap {

    public static void main(String[] args) {
        Integer i = new Integer(3);
        pointToOtherObject(i);
        System.out.println("i="+i);
    }

    private static void pointToOtherObject(Integer i) {
        i = new Integer(2);
    }
}
