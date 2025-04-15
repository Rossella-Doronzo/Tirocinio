/*Implementare un metodo che inverta gli elementi di un array
(ad esempio, un array [1, 2, 3] diventa [3, 2, 1]).

Implementare un metodo che rimuova un elemento specifico da un array di numeri.
Dopo la rimozione, l'array dovrebbe ridurre la sua dimensione.
1 2 3 4 5
3
1 2 4 5

*/

package esercizi.array;

import java.util.Arrays;

public class EserArray {

    public static void main (String [] args){

        //inizializzo array e assegno valori allo stesso tempo
        int array[] = new int[]{ 1, 2, 3, 4, 5, 6, 7 };

        /*assegno valori array in maniera statica int [] array = { 1, 2,3,4,5,6,7};

         inizializzo  int [] array = new int [];

        int [] array =  new int [] { 1, 2,3,4,5,6,7};

       */

        // creo array vuoto per contenere i valori invertiti

        int n = array.length;
        int arrayInvertito[]= new int [n];

        for (int i = 0; i < array.length; i++){

            arrayInvertito[i] = array[n - 1 - i ];

        }

        System.out.println ("Ecco l'array invertito " + Arrays.toString(arrayInvertito));



        int arrayNumeri [] = {1, 2, 3, 4, 5, 7};
        int arrayAggiornato [] = new int [arrayNumeri.length - 1];
        int valoreEliminare = 7;

        int posizioneDaEliminare = - 1;


        for (int i = 0; i < arrayNumeri.length; i++) {

            if (arrayNumeri[i] == valoreEliminare) {

                posizioneDaEliminare = i;
                break;
            }

        }
        if(posizioneDaEliminare == -1){

            System.out.println("Non ho trovato nessun numero da eliminare");
        } else {

            int indiceArray = 0;

            for (int j = 0; j < arrayNumeri.length; j++) {

                if (j != posizioneDaEliminare) {

                    arrayAggiornato[indiceArray] = arrayNumeri[j];
                    indiceArray++;
                }

            }
            System.out.println("L'array aggiornato è: " + Arrays.toString(arrayAggiornato));

        }
    }

}





