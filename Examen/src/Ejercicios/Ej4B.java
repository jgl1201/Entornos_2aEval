package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

// Ingrese un texto de al menos 6 palabras e indique qué letras no han aparecido en el texto.

public class Ej4B {
	public static void main(String[] args) {

		char[] alphabet = new char[26];
		for (int i = 0; i < alphabet.length; i++) alphabet[i] = (char) ('a' + i);
		System.out.println(Arrays.toString(alphabet));

		Scanner sc = new Scanner(System.in);
		String[] text = new String[20];
		boolean keep = true;
		int numberWords = 0;
		System.out.println("Introduzca palabras (minimo 6) (fin para terminar): ");

		while (keep) {
			System.out.println("Palabra: ");
			String word = sc.next();
			text[numberWords] = word;
			numberWords++;
			if (word.equalsIgnoreCase("fin") && numberWords >= 6)
				keep = false;
		}
		System.out.println(Arrays.toString(text));

		String letters = "";

		for (int i = 0; i < numberWords - 1; i++)
			letters += text[i];
		System.out.println(letters);

		for (int i = 0; i < alphabet.length; i++) {
			if (letters.indexOf(alphabet[i]) == -1)
				System.out.println(alphabet[i] + " no aparece");
		}

		sc.close();
	}

}
