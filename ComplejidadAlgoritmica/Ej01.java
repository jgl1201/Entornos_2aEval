// sumar los números del 0 a X
// indicar el tipo de complpejidad

public class Ej01 {

    // complejidad O(n) = LINEAL
    static int add (int x) {
        int total = 0;
        for (int i = 0; i <= x; i++) total += i;
        return total;
    }

    // complejidad 0(1) = CONSTANTE
    static int betterAdd (int x) {
        return (x * (x + 1)) / 2;
    }

    public static void main(String[] args) {
        System.out.println(add(12));
        System.out.println(betterAdd(12));
    }

}
