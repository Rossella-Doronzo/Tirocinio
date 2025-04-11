package esercizi;

public class Moto extends MezziTrasporto {

    private String targa;
    private int cilindrata;


    public Moto(String modello, int velocitaMassima, String targa, int cilindrata){

        super(modello, velocitaMassima);
        this.targa = targa;
        this.cilindrata = cilindrata;
    }

    @Override
    public void mostraInfoMezzi (){
        super.mostraInfoMezzi();
        System.out.println("la targa della moto è : " + targa + cilindrata);


    }
}
