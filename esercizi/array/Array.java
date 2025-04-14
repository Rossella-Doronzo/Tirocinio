 /*Trova il massimo e il minimo in un array e trovami tutti i duplicati e la loro posizione
  */

package esercizi.array;

public class Array {

    public static void main(String[] args) {

        int array[] = {2, 4, 10, 20};

        boolean valoriDuplicati = false;
        int valoreMinimo = array[0];
        int valoreMassimo = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < valoreMinimo) {

                valoreMinimo = array[i];

            }
            if (array[i] > valoreMassimo) {

                valoreMassimo = array[i];

            }


        }

        System.out.println("Il valore minimo è: " + valoreMinimo);

        System.out.println("Il valore massimo è: " + valoreMassimo);

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {

                    valoriDuplicati = true;

                    System.out.println("Il numero" + array[i] + "duplicato si trova alla posizione" + i + "e" + j);

                }

            }

        }

        if (!valoriDuplicati){

            System.out.println ("Non ci sono duplicati");
        }
    }
}
