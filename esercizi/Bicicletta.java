package esercizi;

public class Bicicletta extends MezziTrasporto{

    private boolean motoreElettrico;


    public Bicicletta (String modello, int velocitaMassima, boolean motoreElettrico){

        super(modello,velocitaMassima);

        this.motoreElettrico = motoreElettrico;
    }

    @Override
    public void mostraInfoMezzi(){
        super.mostraInfoMezzi();
        System.out.println( "La bici ha il motore eletrrico? " + motoreElettrico);

    }
}
