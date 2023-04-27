// hallar en que casa tiene que vivir maria para que
// el la suma de los portales a la derecha sea la misma que  a la izqda

public class Ej02 {

    // complejidad O(n^2) = CUADRATICA
    static int getHouseNumber(int totalHouses) {
        for(int i = 2; i <= totalHouses; i++) {

            int total1 = 0;
            for(int j = 1; j <= i - 1; i++) {
                total1 += j;
            }

            int total2 = 0;
            for(int k = i + 1; k <= totalHouses; k++) {
                total2 += k;
            }
            if(total1 == total2) return i;
        }
        return -1;
    }

    static int betterAdd (int x) {
        return (x * (x + 1)) / 2;
    }

    // complejidad O(n) = LIENAL
    static int getHouseNumberBetter(int totalHouses) {
        for(int i = 2; i <= totalHouses; i++) {
            int addRight = betterAdd(i - 1);
            int addLeft = betterAdd(totalHouses) - betterAdd(i);
            if(addLeft == addRight) return i;
        }
        return -1;
    }

    // complejidad O(1) = CONSTANTE
    int getHouseNumberBest(int totalCasas){
        double v = Math.sqrt(betterAdd(totalCasas) );
        return (v %1 == 0)?(int)v:-1;
     }

}