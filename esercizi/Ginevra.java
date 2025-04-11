package esercizi;

public class Ginevra extends PersonaggiVideogioco{

    public Ginevra (String nome, String ruolo, int livello){

        super(nome,ruolo,livello);
    }

    @Override
    public void esegueAbilita(){
        System.out.println(nome + " grazie ai suoi poteri finora celati, è riuscita a trasformarsi in una fata e a fuggire dal bosco stregato");
    }
}
