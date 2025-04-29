//Implementare un metodo che inverta una stringa fornita utilizzando un ciclo for.

package esercizi.array;

public class StringaInvertita {
    public static void main (String [] args){

        String daInvertire = "programmazione";
        String invertita = "";

        //inizio dall'ultimo carattere fin quando non arrivo al primo con indice 0
        for (int i = daInvertire.length() -1; i >= 0; i--){

            invertita += daInvertire.charAt(i);

        }

        System.out.println ("La stringa invertita è: " + invertita);
    }
}
