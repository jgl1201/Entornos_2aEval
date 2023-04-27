package Circunference;
/*
 * Copyright (c) 2023, Jorge Garcia. All right reserved.
 */

/**
 * Clase para el manejo de circunferencias
 * @author jgl1201
 * @version 1.0
 * @see https://es.wikipedia.org/wiki/Circunferencia
 *
 */
public class Circunference {
	/**
	 * Determina la constante PI
	 */
	private final static float PI = (float) Math.PI;
	/**
	 * Determina la distancia del centro al borde
	 */
	public float radius;
	/**
	 * Determina el color
	 */
	@SuppressWarnings("unused")
	private String color;
	/**
	 * Determina la posicion de la cordenada horizontal
	 */
	public int x;
	/**
	 * Determina la posicion de la cordenada vertical
	 */
	public int y;
	
	/**
	 * Constructor que instancia una circunferencia de color negro con radio 1
	 * @param radius Determina la distancia del centro al borde
	 */
	public Circunference() {
		this.radius = 1;
		setColor((byte)0, (byte)0, (byte)0);
	}
	
	/**
	 * Constructor que instancia una circunferencia de color negro a partir de su radio
	 * @param radius Determina la distancia del centro al borde
	 */
	public Circunference(float radius) {
		this.radius = radius;
		setColor((byte)0, (byte)0, (byte)0);
	}

	/**
	 * Calcula la longitud en metros del borde de la circunferencia
	 * @return el perimetro en metros
	 */
	public float perimeter() {
		return 2 * PI * this.radius;
	}

	/**
	 * Calcula la superficie en metros cuadrados de la circunferencia
	 * @return la superficie en metros cuadrados
	 */
	public float area() {
		return PI * this.radius * this.radius;
	}
	
	/**
	 * Calcula la superficie en metros cuadrados de la circunferencia
	 * @deprecated
	 * @return la superficie en metros cuadrados
	 */
	public float surface() {
		return area();
	}
	
	/**
	 * Establece el color de la circunferencia en base a sus componentes rgb
	 * @param r Cantidad en hexadecimal de rojo
	 * @param g Cantidad en hexadecimal de verde
	 * @param b Cantidad en hexadecimal de azul
	 */
	public void setColor(byte r, byte g, byte b) {
		this.color = "#" + r + g + b;
	}

	/**
	 * Metodo que determina si un punto dado esta 
	 * dentro o fuera de la circunferencia
	 * @param px coordenada horizontal del punto
	 * @param py coordenada vertical del punto
	 * @return true si el punto esta dentro de la circunferencia
	 */
	boolean isPointInside(int px, int py) {
		int vx = px - x;
		int vy = py - y;
		// PITAGORAS
		double h = Math.sqrt((vx * vx) + (vy * vy));
		return (h < radius);
		}
	
}
