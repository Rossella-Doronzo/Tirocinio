/* Data una matrice di dimensioni MxN e un
 valore intero da cercare, scrivi un programma Java che
 verifichi se il numero è presente nella matrice e restituisca
  tutte le posizioni (righe e colonne) in cui appare.
  Verifica la presenza di valori duplicati nella matrice.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[]args) {

        //istanziato oggetto matrice e specificato le due dimensioni
        int matrice[][] = {
                {1, 2, 3, 4},
                {5, 4, 3},
        };

        int valoreCercare = 3;
        int valoreDuplicato = valoreCercare;
        boolean valoreTrovato = false;

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] == valoreCercare) {
                    System.out.println ("la riga è: " + i + "la colonna è: " + j);

                    if (valoreDuplicato==valoreCercare) {
                        valoreTrovato = true;
                        break;

                    }


                }
            }

        }
        System.out.println( "Il valore " + valoreCercare + "è stato duplicato");
    }
    }