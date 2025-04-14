package esercizi.giochi;

public class Lancillotto extends PersonaggiVideogioco {

    public Lancillotto (String nome, String ruolo, int livello){
        super(nome,ruolo,livello);
    }
    @Override
    public void esegueAbilita(){
        System.out.println(nome + " sguainò la spada e trafisse a morte l'orribile mostro che ormai da tempo spaventava la corte di Camelot");
    }
}
