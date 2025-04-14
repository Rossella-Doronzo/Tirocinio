/*
Creare una classe astratta Prodotto con un metodo astratto calcolaPrezzo che
accetta come input una quantità e restituisce il prezzo del prodotto, successivamente creare
una classe Libro che estende la classe Prodotto e implementa il metodo calcolaPrezzo
per calcolare il prezzo del libro

*/

package esercizi.prodotto;

public abstract class Prodotto {

    abstract double calcolaPrezzo (int quantita);
}
