/* Data una matrice di dimensioni MxN e un
 valore intero da cercare, scrivi un programma Java che
 verifichi se il numero è presente nella matrice e restituisca
  tutte le posizioni (righe e colonne) in cui appare.
  Verifica la presenza di valori duplicati nella matrice.
*/

package esercizi.array;
public class Main {
    public static void main(String[] args) {

        //istanziato oggetto matrice e specificato le due dimensioni
        int matrice[][] = {
                {1, 2, 3, 4},
                {5, 4, 3, 8},
        };

        boolean valoreDuplicato = false;


        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                /*if (matrice[i][j] == valoreCercare) {
                    System.out.println ("la riga è: " + i + "la colonna è: " + j);
                   */
                for (int k = 0; k < matrice.length; k++) {
                    for (int l = 0; l < matrice[k].length; l++) {

                        if (i != k || j != l) {
                            if (matrice[i][j] == matrice[k][l]) {
                                if (!valoreDuplicato) {
                                    valoreDuplicato = true;
                                }
                                System.out.println("Il valore duplicato è " + matrice[i][j]);
                                break;

                            }
                        }
                    }
                    if (valoreDuplicato) {
                        break;
                    }
                }
                if (valoreDuplicato) {
                    break;
                }
            }
            if (valoreDuplicato) {
                break;
            }
            if (!valoreDuplicato) {
                System.out.println(" Non ci sono valori duplicati");
            }

        }
    }
    }

