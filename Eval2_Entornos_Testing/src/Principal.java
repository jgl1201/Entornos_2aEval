
public class Principal {

	public static float add (float n1, float n2) {
		return n1 + n2;
	}
	
	public static char getFirstCharUpper (String text) {
		if (text == null) return 0;
		if (text.equals("")) return 0;
		return text.toUpperCase().charAt(0);
	}
	
	public static float addArray (float[] array) {
		if (array == null) return 0;
		float add = 0;
		for (int i = 0; i < array.length; i++) {
			add += array[i];
		}
		return add;
		}
	
	public static int getHighestValue (int[] values) {
		if (values == null) return 0;
		if (values.length == 0) return 0;
		int highest = values[0];
		for (int i = 0; i < values.length; i++) {
			if (values[i] > highest) highest = values[i];
		}
		return highest;
	}
	
	public static void main(String[] args) {
		
	}
	
}
