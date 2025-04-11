/*
Crea una gerarchia di classi per rappresentare diversi mezzi di trasporto. La classe base
deve contenere attributi comuni come il modello e la velocità massima, oltre a un metodo
per mostrare le informazioni del mezzo. Le sottoclassi devono rappresentare tipi specifici
di mezzi, come auto e biciclette, aggiungendo attributi distintivi (ad esempio, il numero di
porte per le auto e la presenza di motore elettrico per le biciclette).
Crea alcune istanze e verifica il funzionamento dei metodi.

 */

package esercizi;

public class MezziTrasporto {

    protected String modello;
    protected int velocitaMassima;


    public MezziTrasporto(String modello, int velocitaMassima) {

        this.modello = modello;
        this.velocitaMassima = velocitaMassima;
    }

    public String getModello() {
        return this.modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getVelocitaMassima() {
        return this.velocitaMassima;
    }

    public void setVelocitaMassima(int velocitaMassima) {
        this.velocitaMassima = velocitaMassima;
    }

    public void mostraInfoMezzi() {

        System.out.println("Il mezzo possiede il seguente modello " + modello + " e la velocità " +
                "massima consentita è di " + velocitaMassima + "Km/h");

    }
}
