package Ejercicios;

import java.util.Arrays;
import java.util.Random;

/*Genera un array de 60 posiciones enteras que tomarán valores entre 0
y 100.
Recorriendo dicho array separe en dos arrays distintos los valores
(no las posiciones) pares e impares.
Ordene ambos arrays por el método Quicksort. Considere el cero par.
Muestre ambos arrays obtenidos por pantalla */

public class Ej2B {
	
	public static void quickSort(int[] items, int left, int right) {
		int i, j;
		int x, y;

		i = left;
		j = right;
		x = items[(left + right) / 2];
		do {
			while ((items[i] < x) && (i < right))
				i++;
			while ((x < items[j]) && (j > left))
				j--;
			if (i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}
		} while (i <= j);
		if (left < j) quickSort(items, left, j);
		if (i < right) quickSort(items, i, right);
	}

	static int generateNumber() {
		Random r = new Random();
		return r.nextInt(101);
	}
	
	static int getNumberEvens (int[] arr) {
		int numberEvens = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) numberEvens++;
		}
		return numberEvens;
	}
	
	public static void main(String[] args) {
		int[] numbers = new int[60];
		
		for(int i = 0; i < numbers.length; i++) numbers[i] = generateNumber();
		System.out.println("Array actual: ");
		System.out.println(Arrays.toString(numbers));
		
		int[] even = new int[getNumberEvens(numbers)];
		int[] odd = new int[numbers.length - getNumberEvens(numbers)];

		int posEven = 0, posOdd = 0;
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				even[posEven] = numbers[i];
				posEven++;
			}
			else {
				odd[posOdd] = numbers[i];
				posOdd++;
			}
		}
		
		quickSort(even, 0, even.length - 1);
		quickSort(odd, 0, odd.length - 1);
		
		System.out.println("Pares: ");
		System.out.println(Arrays.toString(even));
		System.out.println("Impares: ");
		System.out.println(Arrays.toString(odd));
	}
	
}
