package Opt01;

class Student {
	String name;
	int height;
}

/* los parametros de tipos primitivos se pasan por valor y los objetos por
 * referencia */
public class Optimizacion01 {

	public static void myFunction(Student student) {
		student = new Student();
		student.height = 200;
	}

	public static void main(String[] args) {
		Student manolo = new Student();
		manolo.height = 180;
		manolo.name = "Manolo";
		
		System.out.println(manolo.height);
		myFunction(manolo);
		System.out.println(manolo.height);
	}
}
