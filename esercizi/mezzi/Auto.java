package esercizi.mezzi;

public class Auto extends MezziTrasporto {

    private int numeroPorte;

    public Auto (String modello, int velocitaMassima, int numeroPorte){

        super(modello, velocitaMassima);
        this.numeroPorte = numeroPorte;
    }

    @Override
    public void mostraInfoMezzi(){

        super.mostraInfoMezzi();
        System.out.println("L' auto possiede " + numeroPorte + "porte");
    }
}
