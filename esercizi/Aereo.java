package esercizi;

public class Aereo extends MezziTrasporto{

    private int numeroPasseggeri;
    private int numeroPersonaleBordo;


    public Aereo (String modello, int velocitaMassima, int numeroPasseggeri, int numeroPersonaleBordo){

        super(modello, velocitaMassima);
        this.numeroPasseggeri = numeroPasseggeri;
        this.numeroPersonaleBordo = numeroPersonaleBordo;


    }
    @Override
    public void mostraInfoMezzi(){
        super.mostraInfoMezzi();
        System.out.println("L'aereo ha: " + numeroPasseggeri + "passeggeri" + " e il numero del personale di bordo equivale a " + numeroPersonaleBordo);
    }

}
