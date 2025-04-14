/*
Quesito: Crea una classe Libro che abbia i seguenti attributi: titolo, autore e prezzo. La classe deve avere almeno due costruttori:
Un costruttore che accetta titolo, autore e prezzo.
Un costruttore che accetta titolo e autore, e imposta il prezzo a un valore predefinito di 20.0.
Crea un metodo descrizione() che stampa una descrizione del libro in base agli attributi. Infine, nel metodo main, crea due oggetti di tipo Libro utilizzando i due costruttori e stampa le loro descrizioni.
 */
package esercizi.libro;

public class Libro {
    private String titolo;
    private String autore;
    private int prezzo;

    public Libro (String titolo, String autore, int prezzo){
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
    }
    public Libro(String titolo, String autore){
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = 20;
    }
    public  String getTitolo(){
        return this.titolo;
    }
    public String getAutore(){
        return this.autore;
    }
    public int prezzo(){
        return this.prezzo;
    }
    public void setTitolo(String titolo){
        this.titolo = titolo;
    }
    public void setAutore(String autore){
        this.autore = autore;
    }
    public void setPrezzo (int prezzo){
        this.prezzo = prezzo;
    }
    public void descrizione(){
        System.out.println("Il libro intitolato " + titolo + " è stato redatto da " + autore + " e ha un costo di " + prezzo);
    }
}
