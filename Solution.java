public class Solution {
	public static Pair < Integer, Integer > swap(Pair < Integer, Integer > swapValues) {
		Integer a = swapValues.getKey();
	    Integer b = swapValues.getValue();

		// Store the value of a in temp.
	    Integer temp = a;
	    // Make a equal to b.
	    a = b;
	    // Make b equal to temp.
	    b = temp;

	    return (new Pair < Integer, Integer > (a, b));
	}
}