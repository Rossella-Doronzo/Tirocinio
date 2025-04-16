/*Implementare un metodo che controlli la posizione
di un elemento in un array di stringhe.*/

package esercizi.array;

public class ArrayStringhe {

    public static void main (String [] args){


        String arrayColori [] = new String[]{"viola", "azzurro", "rosso", "giallo", "blu", "bianco"};

        String elementodaTrovare = "azzurro";
        boolean elementoTrovato = false;


        for (int i= 0; i < arrayColori.length; i++){

            if(arrayColori[i] == elementodaTrovare){

                elementoTrovato =true;

                System.out.println("L'elemento " + elementodaTrovare + " si trova alla posizione: " + i);

            }
            // se voglio sapere invece  la posizione di tutti gli elementi
             // String elementoArray = arrayColori[i];
            //System.out.println("La posizione dell' elemento " + arrayColori[i] + " è: " + i);


        }
            if(!elementoTrovato){

            System.out.println("Non ho trovato nessun elemento");
            }

    }
}
