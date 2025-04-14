package esercizi.geometria;

public class Cerchio extends Forma {

    private int raggio;

    public Cerchio (int raggio){
        this.raggio = raggio;
    }
    @Override
   int calcolaArea() {
        return raggio * raggio;
    }
}
