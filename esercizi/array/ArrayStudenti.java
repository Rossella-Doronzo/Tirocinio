package esercizi.array;

public class ArrayStudenti {

    public static void main(String[] args) {

        // creo array di oggetti
        Studenti[] listaStudenti = {
                new Studenti("Luca", "Gentile", "Giurisprudenza"),
                new Studenti("Rosa", "Dileo", "Informatica"),
                new Studenti("Angelo", "Rossi", "Ingegneria"),
                new Studenti("Maria", "Bianchi", "Mediazione Linguistica"),
                new Studenti("Roberto", "Neri", "Medicina")};


        for (Studenti studente : listaStudenti) {

            studente.informaDati();
        }

        for (Studenti studente : listaStudenti) {

            studente.informaNome();
        }


    }
}
