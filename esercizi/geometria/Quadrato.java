package esercizi.geometria;

public class Quadrato extends Forma {
    private int lato;

    public Quadrato(int lato) {
        this.lato = lato;
    }
        @Override
        int calcolaArea(){
            return lato * lato;
    }
}
