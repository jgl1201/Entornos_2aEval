/* En vez de usar un switch se 
 * usa herencia en con clases.
 * Para no repetir el método
 * en todas las clases hijas,
 * lo ponemos en la clase padre.
 * Para evitar que una clase tenga
 
 * muchos atributos, los agrupamos en una
 * clase nueva que luego le pasamos.
 * Separamos las clases en diferentes
 * ficheros para que no haya tantas lineas
 */

public class Principal {
    Thief player1 = new Thief();
    Magician player2 = new Magician();
    Paladin player3 = new Paladin();

    void saveUser(User user) {

    }
    void deleteUser(User user) {
        //TODO delete user
    }

    public static void main(String[] args) {
        
    }
}