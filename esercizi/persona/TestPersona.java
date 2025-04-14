package esercizi.persona;

public class TestPersona {
    public static void main (String[] args){
        Persona persona1 = new Persona ("Giulia", 32);
        Persona persona2 = new Persona ("Fabrizio", 25);
        Persona persona3 = new Persona ("Genoveffa", 70);

        // ottengo gli attributi con il get
        persona1.getEta();
        persona2.getNome();

        // modifico gli attributi con il set

        persona2.setEta(50);
        persona2.setNome("Matilde");



        System.out.println("Di seguito l'età modificata: " + persona2.getEta());
        System.out.println ("Di seguito il nome modificato: " + persona2.getNome());
    }
}