package esercizi;

public class Libro2 extends Prodotto{

   private double prezzo;

   public Libro2 (double prezzo){

       this.prezzo = prezzo;
   }

    @Override
    double calcolaPrezzo(int quantita){
        return prezzo * quantita;
    };
}
