package esercizi.giochi;

public class ReArtu extends PersonaggiVideogioco {

    public ReArtu( String nome, String ruolo, int livello){

        super(nome, ruolo, livello);
    }
    @Override
    public void esegueAbilita(){
        System.out.println(nome + " ordinò ai suoi soldati di combattere contro l'esercito nemico e di non temere! Il re possedeva un' arma segreta, ovvero, la sua potente spada magica");
    }
}
