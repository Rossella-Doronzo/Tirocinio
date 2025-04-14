package esercizi.conto;

public class Main1 {

    public static void main (String []args){

        ContoBancario conto = new ContoBancario(2000, "IT542178809099");

        conto.depositaDenaro(3000);
        conto.prelevaDenaro(800);
    }
}
