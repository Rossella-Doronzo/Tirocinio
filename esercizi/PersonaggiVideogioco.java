
/*Realizza un sistema di classi per rappresentare diversi tipi di personaggi in
 un videogioco. La classe base deve contenere informazioni generali come il nome e il livello,
 oltre a un metodo per mostrare i dettagli del personaggio. Le sottoclassi devono rappresentare
 ruoli specifici, come maghi e guerrieri, con metodi per eseguire le loro abilità uniche.
 Crea alcune istanze e verifica il funzionamento dei metodi.
 */

package esercizi;

public class PersonaggiVideogioco {

   protected String nome;
   protected String ruolo;
   protected int livello;

    public PersonaggiVideogioco(String nome, String ruolo, int livello){

        this.nome = nome;
        this.ruolo = ruolo;
        this.livello = livello;
    }

    public void mostraDettagliPersonaggio (){
        System.out.println ("Il seguente personaggio si chiama " + nome + " nello specifico il suo ruolo è quello di " +
                ruolo + " e appartiene al " + livello + " livello");
    }

    public void esegueAbilita(){
        System.out.println ("Il personaggio possiede questa abilità: ");
    }

}
