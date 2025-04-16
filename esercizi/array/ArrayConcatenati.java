/*Implementare un metodo che concateni due array
 di numeri interi in un singolo array*/

package esercizi.array;

import java.util.Arrays;

public class ArrayConcatenati {

    public static void main (String [] args){

        int arrayUno [] = new int []{2, 8, 12, 14, 18, 60};

        int arrayDue [] = new int[]{10, 14, 20, 22, 32, 50};

        int arrayComposto[] = new int[arrayUno.length + arrayDue.length];


        // copio gli elementi nell'arrayComposto
        for (int i = 0; i <arrayUno.length;i++){

          arrayComposto[i] = arrayUno[i];
        }
        for (int j = 0; j < arrayDue.length; j++){

            arrayComposto[arrayUno.length + j] = arrayDue[j];
        }

        System.out.println ("L' array composto è: " + Arrays.toString(arrayComposto));
    }
}
