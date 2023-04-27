import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrincipalTest {

	@Test
	void testAddInteger() {
		float result = Principal.add(4, 3);
		assertEquals(7, result);
	}

	@Test
	void testAddDecimal() {
		float result = Principal.add(3.5f, 0.2f);
		assertEquals(3.7, result, 0.001);
	}
	
	@Test
	void getFirstLetter() {
		char letter = Principal.getFirstCharUpper("la zorra de tu madre");
		assertEquals('L', letter);
	}
	
	@Test
	void testEmptyString() {
		char letter = Principal.getFirstCharUpper("");
		assertEquals(0, letter);
	}
	
	@Test
	void testNullString() {
		char letter = Principal.getFirstCharUpper(null);
		assertEquals(0, letter);
	}
	
	@Test
	void testAddArray() {
		float[] list = new float[] {4, 7, 2};
		float add = Principal.addArray(list);
		assertEquals(13, add);
	}
	
	@Test
	void testAddEmptyArray() {
		float[] list = new float[] {};
		float add = Principal.addArray(list);
		assertEquals(0, add);
	}
	
	@Test
	void testAddNullArray() {
		float[] list = null;
		float add = Principal.addArray(list);
		assertEquals(0, add);
	}
	
	@Test
	void testHighestNumber() {
		int[] values = new int[] {4, 2, 7, 1};
		int result = Principal.getHighestValue(values);
		assertEquals(7, result);
	}
	
	@Test
	void testHighestNumberEmpty() {
		int[] values = new int[] {};
		int result = Principal.getHighestValue(values);
		assertEquals(0, result);
	}
	
	@Test
	void testHighestNumberNull() {
		int[] values = null;
		int result = Principal.getHighestValue(values);
		assertEquals(0, result);
	}
	
}
