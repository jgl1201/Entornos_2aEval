
public class CoffeeMaker {

/*	public boolean makeCoffee(String coffeeType, float temperature, float waterAmount) {
		if (!coffeeType.equals("")) {
			if (temperature > 0 && temperature < 100) {
				if (waterAmount > 10) {
					// hacer cafe
					return true;
				} else {
					System.out.println("Nivel de agua incorrecto");
					return false;
				}
			} else {
				System.out.println("Temperatura incorrecta");
				return false;
			}
		} else {
			System.out.println("Tipo de cafe incorrecto");
			return false;
		}
	}
*/
	
	private boolean validateCoffeeType(String coffeType) {
		return !coffeType.equals("");
	}
	
	private boolean validateTemperature(float temperature) {
		return temperature > 0 && temperature < 100;
	}
	
	private boolean validateWaterAmount(float waterAmount) {
		return waterAmount < 100;
	}
	
	public boolean makeCoffee(String coffeeType, float temperature, float waterAmount) throws Exception {
		if (!validateCoffeeType(coffeeType)) throw new Exception("Tipo de cafe incorrecto");
		if (!validateTemperature(temperature)) throw new Exception("Temperatura incorrecta");
		if (!validateWaterAmount(waterAmount)) throw new Exception("Nivel de agua incorrecto");
		return true;
	}
	
	public static void main(String[] args) {
		CoffeeMaker nesspreso = new CoffeeMaker();
		try {
			nesspreso.makeCoffee("Arabiga", 20, 30);
			System.out.println("Cafe hecho!!");
		} catch (Exception e) {
			System.out.println("Fallo en la cafetera: " + e.getMessage());
		}
	}
}