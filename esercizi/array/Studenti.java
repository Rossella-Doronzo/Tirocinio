/*
implementare un programma che salvi dei studenti con nome cognome facolta. Si crei un
array che vada a memorizzare questi studenti, creare 2 metodi: uno che stampi tutti i
dati degli studenti, uno che stampi solo il nome di tutti gli studenti.
cominciamo a pensare con una visione di frammentazione logia: non facciamo tutto dentro al main, ma creiamo
dei METODI dove andiamo a scrivere la logica.
Quindi nel main chiameremo questi metodi passando come parametro / i le informazioni su cio dobbiamo lavorare.

l'esercizio degli oggetti comincia a ragionare proprio ad oggetti, con classi dati e classi logia distinte. poi
nel main andiamo solo a inserire gli studenti e chiamare i metodi che ci servono.
 */


package esercizi.array;

public class Studenti {

    private String nome;
    private String cognome;
    private String facolta;


    public Studenti(String nome, String cognome, String facolta) {

        this.nome = nome;
        this.cognome = cognome;
        this.facolta = facolta;

    }

    public String getNome() {

        return this.nome;
    }

    public String getCognome() {

        return this.cognome;
    }

    public String getFacolta() {

        return this.facolta;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setCognome(String cognome) {

        this.cognome = cognome;
    }

    public void setFacolta(String facolta) {

        this.facolta = facolta;
    }


    public void informaDati() {

        System.out.println(" Lo studente " + nome + " " + cognome + " " + "frequenta l'università di " + facolta);

    }

    public void informaNome() {

        System.out.println(" Il nome dello studente è: " + nome);
    }

}