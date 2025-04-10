package esercizi;

public class Main {

    public static void main (String []args){

        Libro libro1 = new Libro("Promessi Sposi", "Alessandro Manzoni", 30);
        Libro libro2 = new Libro("La Divina Commedia", "Dante Alighieri");

        libro1.descrizione();
        libro2.descrizione();
    }
}
