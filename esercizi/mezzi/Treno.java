package esercizi.mezzi;

public class Treno extends MezziTrasporto {

    private int numeroCarrozze;

    public Treno (String modello, int velocitaMassima, int numeroCarrozze){

        super(modello,velocitaMassima);
        this.numeroCarrozze = numeroCarrozze;
    }

    @Override
    public void mostraInfoMezzi(){
        super.mostraInfoMezzi();
        System.out.println("Il treno ha " + numeroCarrozze + "carrozze");
    }
}
