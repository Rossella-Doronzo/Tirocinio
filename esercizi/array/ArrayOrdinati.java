/*Implementare un metodo che ordini un array di numeri decimali
 in ordine crescente, e decrescente.
 */

package esercizi.array;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayOrdinati {

    public static void main(String[] args) {

        double arrayOrdinati[] = new double[]{5.4, 8.3, 8.2, 6.9, 3.2, 1.4};

        Arrays.sort(arrayOrdinati);

        System.out.println("Il seguente array è in ordine crescente" + Arrays.toString(arrayOrdinati));

        /*il metodo Comparator (inverte ordine naturale elementi) e richiede oggetti, per
        questo uso la classe wrapper
         */

        Double arrayOggetti[] = new Double[arrayOrdinati.length];

        for (int i = 0; i < arrayOggetti.length; i++) {

            arrayOggetti[i] = arrayOrdinati[i];
        }


        Arrays.sort(arrayOggetti, Comparator.reverseOrder());

        for (int i = 0; i < arrayOggetti.length; i++) {

            arrayOrdinati[i] = arrayOggetti[i];
        }

        System.out.println ("Il seguente array è in ordine decrescente" + Arrays.toString(arrayOggetti));
    }
}
