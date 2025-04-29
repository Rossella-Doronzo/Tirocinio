/*Implementare un metodo che verifichi se una stringa fornita è un palindromo (uguale se
letta da sinistra a destra e viceversa) utilizzando un ciclo for.
 */


package esercizi.array;

public class Palindroma {

    public static void main(String[] args) {

        boolean palindroma = true;
        String parola = "anna";


        for (int i = 0; i < parola.length() / 2; i++) {
            if (parola.charAt(i) != parola.charAt(parola.length() - 1 - i)) {

                palindroma = false;
                break;

            }

        }


        if (palindroma) {
            System.out.println("La parola palindroma è: " + parola);
        } else {
            System.out.println("La parola non è palindroma");
        }
    }
}