package Ej5B;

import java.util.ArrayList;
import java.util.Scanner;
/* Programa que permita con un menú y usando una lista dinámica:
a/ poblar la lista con la información de varias personas (como
mínimo 5)
b/ añadir una persona
b/ Mostrar la información de todas las personas
c/ ordenar la lista por apellido en orden alfabético
d/ ordenar la lista por edad
e/ eliminar una persona (introduciendo el dni)
Use la clase auxiliar Persona.java */

public class MenuPersona {

	static ArrayList<Persona> persons = new ArrayList<Persona>();

	static void fillPersons() {
		persons.add(new Persona("12345678A", "Dominguez Lima", "Pablo", "Hombre", 21, 80));
		persons.add(new Persona("12345679B", "Centeno Perez", "Iago", "Hombre", 20, 80));
		persons.add(new Persona("12345670C", "Garcia Lopez", "Jorge", "Hombre", 20, 100));
		persons.add(new Persona("12345671D", "Gonzalez Benitez", "Maria", "Mujer", 27, 62));
		persons.add(new Persona("12345672E", "Dominguez Alvarez", "Pepa", "Mujer", 50, 55));
	}
	
	public static void main(String[] args) {
		fillPersons();

		Scanner sc = new Scanner(System.in);
		int option = 0;
		boolean keep = true;

		do {
			System.out.println("Gestion de Persona");
			System.out.println("---------------------");
			System.out.println("Seleccione una opcion: ");
			System.out.println("1- Anhadir una persona");
			System.out.println("2- Listar las personas");
			System.out.println("3- Ordenar alfabeticamente por apellido");
			System.out.println("4- Ordenar por edad");
			System.out.println("5- Eliminar una persona");
			System.out.println("6- Salir");
			option = Integer.parseInt(sc.nextLine());

			switch (option) {
			case 1:
				String dni, apellidos, nombre, sexo;
				int edad;
				double peso;
				System.out.println("DNI: ");
				dni = sc.nextLine();
				System.out.println("Apellidos: ");
				apellidos = sc.nextLine();
				System.out.println("Nombre: ");
				nombre = sc.nextLine();
				System.out.println("Sexo: ");
				sexo = sc.nextLine();
				System.out.println("Edad: ");
				edad = Integer.parseInt(sc.nextLine());
				System.out.println("Peso: ");
				peso = Double.parseDouble(sc.nextLine());
				persons.add(new Persona(dni, apellidos, nombre, sexo, edad, peso));
				break;
			case 2:
				for (Persona p : persons)
					System.out.println(p.toString());
				break;
			case 3:
				break;
			case 4:

				break;
			case 5:
				String deleteDni;
				System.out.println("DNI a eliminar: ");
				deleteDni = sc.nextLine();
				for (Persona p1 : persons) {
					if (p1.getDni() == deleteDni) persons.remove(p1);
				}
				break;
			case 6:
				keep = false;
				System.out.println("Saliendo");
				break;
			}
		} while (keep);

		sc.close();

	}

}
