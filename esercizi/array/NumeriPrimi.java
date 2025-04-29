/*Implementare un metodo che verifichi se un numero intero è un numero
primo utilizzando un ciclo for.


 */


package esercizi.array;

import java.util.Scanner;
public class NumeriPrimi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero che desideri verificare");
        int numero = scanner.nextInt();

        boolean numeroPrimo = true;

        if (numero < 1){
            numeroPrimo = false;

        } else {
            for (int i = 2; i < numero/2; i++ ){

                if (numero % i ==0){

                    numeroPrimo = false;
                    break;
                }
            }
        }
        if (numeroPrimo){
            System.out.println( "Il numero inserito è un numero primo ");
        } else {
            System.out.println("Il numero inserito non è un numero primo");
        }
        scanner.close();
    }
}



