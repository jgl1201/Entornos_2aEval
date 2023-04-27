package Circunference;

public class Principal {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Circunference c = new Circunference();
		c.radius = 5;
		float a = c.area();
		c.setColor((byte)0xFF, (byte)0x00, (byte)0x0F);
	}

}
