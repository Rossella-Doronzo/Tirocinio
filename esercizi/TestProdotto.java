package esercizi;

public class TestProdotto {

    public static void main (String [] args){

        int quantita = 5;
        Libro2 libro = new Libro2 (40.50);

        double prezzoFinale = libro.calcolaPrezzo(quantita);
        System.out.println( "Il prezzo del libro è: " + prezzoFinale);
    }
}
