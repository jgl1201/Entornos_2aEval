package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/*Pedir por teclado la introducción de una tabla de 10 elementos
numéricos enteros.
Pedir por teclado un valor entero al usuario y desplace dicho número
de veces las posiciones del array.
Los números que salgan por el final del ARRAY deberán entrar de
nuevo por el principio del mismo. */

public class Ej1B {
	
	static int[] rotateArray(int[] arr) {
		int aux = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = aux;
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[10];
		int numRotation;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Posicion " + i + ": ");
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("Array actual: ");
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("Cuantas posiciones quieres desplazar el array: ");
		numRotation = sc.nextInt();
		
		for (int i = 0; i < numRotation; i++) rotateArray(numbers);
		System.out.println("El array queda asi: ");
		System.out.println(Arrays.toString(numbers));
		
		sc.close();
	}

}
