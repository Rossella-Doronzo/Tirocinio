/*Implementare un metodo che rimuova i duplicati da un
array, lasciando solo i valori unici.*/

package esercizi.array;

import java.util.Arrays;

public class ArrayDuplicati {

    public static void main(String[] args) {

        int array[] = new int[]{88, 90, 10, 24, 88, 10, 70};
        int arraySenzaDuplicati[] = new int[array.length];
        int nuovoIndiceArray = 0;



        for (int i = 0; i < array.length; i++) {
            boolean valoreDuplicato = false;

            for (int j = 0; j < array.length; j++) {

                if (i != j && array[i] == array[j]) {

                    valoreDuplicato = true;

                    System.out.println("Ecco i duplicati: " + array[i]);


                    break;
                }
            }
            if (!valoreDuplicato) {

                valoreDuplicato = false;
                arraySenzaDuplicati[nuovoIndiceArray] = array[i];
                nuovoIndiceArray++;
            }
        }
        // qui copio solo i valori che non si ripetono
        int arrayFinale[] = new int [nuovoIndiceArray];
        for (int i = 0; i < nuovoIndiceArray; i++){

            arrayFinale[i] = arraySenzaDuplicati[i];
        }
        System.out.println("L' array senza i duplicati è: " + Arrays.toString(arrayFinale));
    }
}