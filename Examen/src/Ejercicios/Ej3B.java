package Ejercicios;

import java.util.Scanner;

/* Crea un programa que reciba una cadena de caracteres y la devuelva
invertida con efecto espejo, esto es, se concatena a la palabra
original su inversa, compartiendo la última letra, que hará de
espejo, por lo que la palabra obtenida se lee igual hacia adelante
que hacia atrás.
Por ejemplo, al introducir “teclado” devolverá “tecladodalcet” y al
introducir “goma” devolverá “gomamog”. */
public class Ej3B {
	
	static String[] rotateArray(String[] arr) {
		String aux = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = aux;
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word;
		
		System.out.println("Palabra: ");
		word = sc.nextLine();
		
		// Letras de la palabra
		String[] letters = word.split("");


		String[] noFinalLetter = new String[letters.length - 1];
		for(int i = 0; i < noFinalLetter.length; i++) {
			noFinalLetter[i] = letters[letters.length - 2 - i];
		
		}
		
		for (int i = 0; i < letters.length ; i++) System.out.print(letters[i]);
		for (int i = 0; i < noFinalLetter.length; i++) System.out.print(noFinalLetter[i]);
		
		sc.close();
	}

}
