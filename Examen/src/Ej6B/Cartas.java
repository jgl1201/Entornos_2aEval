package Ej6B;

/*Escribe un programa que genere una secuencia de 5 cartas de la
baraja francesa de palos (corazones, diamantes, picas y tréboles) y
números (A,K,Q,J,10,9,8,7,6,5,4,3,2) sin que se repita ninguna.
El valor de las cartas se debe guardar en una estructura HashMap que
debe contener parejas (número, valor).
El valor de las cartas es el siguiente: as → 20, K,Q,J → 15, el
resto de cartas su número.
La secuencia de cartas debe ser una estructura de la clase ArrayList
que contiene objetos de la clase Carta.
Se deberá listar la mano de cinco cartas ordenadas por PALO y NÚMERO
SEGÚN EL ENUNCIADO y a continuación el total de puntos de la mano
Ejemplo: as de picas, cinco de corazones, reina de tréboles, jota de
diamantes, seis de picas.
Tienes 61 puntos */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

@SuppressWarnings("rawtypes")
class Cards implements Comparable{
	
	String value;
	String palo;
	
	final static String[] values = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4" , "3" , "2"};
	final static String[] palos = {"CORAZONES", "DIAMANTES", "TREBOLES", "PICAS"};
	
	
	public static String generateValue() {
		int val = (int) (Math.random() * 13);
		return values[val];
	}
	
	public static String generatePalo() {
		int val = (int) (Math.random() * 4);
		return palos[val];
	}
	
	Cards() {
		this.value = generateValue();
		this.palo = generatePalo();
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	@Override
	public String toString() {
		return "Cards [value=" + value + ", palo=" + palo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(palo, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cards other = (Cards) obj;
		return Objects.equals(palo, other.palo) && Objects.equals(value, other.value);
	}	

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		// primero por palo
		Cards car = (Cards) obj;

		//si son palos distintos ordena por palo
		if (!this.getPalo().equals(car.getPalo()))
			return this.getPalo().compareTo(car.getPalo());
		//si son del mismo palo ordena por valor
		else
			return this.getValue().compareTo(car.getValue());

	}
}

@SuppressWarnings("unchecked")
public class Cartas {

	static HashMap<String, Integer> points = new HashMap<String, Integer>();
	
	static ArrayList<Cards> hand = new ArrayList<Cards>();
	
	static void setPoints() {
		points.put("A", 20);
		points.put("K", 15);
		points.put("Q", 15);
		points.put("J", 15);
		points.put("10", 10);
		points.put("9", 9);
		points.put("8", 8);
		points.put("7", 7);
		points.put("6", 6);
		points.put("5", 5);
		points.put("4", 4);
		points.put("3", 3);
		points.put("2", 2);
	}
	
	public static void main(String[] args) {
		setPoints();
		int totalPoints = 0;
		
		do {
			Cards c1 = new Cards();
			if (!hand.contains(c1)) hand.add(c1);
		} while (hand.size() < 5);
	
		Collections.sort(hand);
		System.out.println("Mano ordenada: ");
		for (Cards carta : hand) System.out.println(carta.toString());
		
		for (Cards card : hand) totalPoints += points.get(card.getValue());
		System.out.println("Puntos: " + totalPoints);
	}
		
}
