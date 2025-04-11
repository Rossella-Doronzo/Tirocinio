package esercizi;

public class MagoMerlino extends PersonaggiVideogioco {

    int incantesimi;
    int numeroPozioni;
    int numeroOggettiMagici;

    public MagoMerlino (String nome, String ruolo, int livello, int incantesimi, int numeroPozioni, int numeroOggettiMagici){

        super(nome, ruolo, livello);
        this.incantesimi = incantesimi;
        this.numeroPozioni = numeroPozioni;
        this.numeroOggettiMagici = numeroOggettiMagici;


    }
    @Override
    public void mostraDettagliPersonaggio(){

        super.mostraDettagliPersonaggio();
        System.out.println ("Gli incantesimi più usati in questa prima parte del videogioco sono: " + incantesimi+ " e per ognuno di essi il mago Merlino ha creato ben " +
                numeroPozioni + "pozioni differenti, servendosi di " + numeroOggettiMagici+ "oggetti magici quali: la bacchetta, l'amuleto di un rosso vermiglio e il libro delle meraviglie");
    }

    @Override
    public void esegueAbilita(){
        System.out.println(nome +" è riuscito a lanciare incantesimi contro il temibile drago, aiutando così il temerario Lancillotto a difendere Camelot");
    }

}
