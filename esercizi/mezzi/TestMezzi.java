package esercizi.mezzi;

public class TestMezzi {

    public static void main(String[] args) {

        Moto moto = new Moto("Yamaha", 500, "ER543", 400);
        Treno treno = new Treno("Frecciarossa", 300, 8);
        Bicicletta bicicletta = new Bicicletta("Mountain bike", 30, true);
        Aereo aereo = new Aereo("Boeing", 800, 100, 10);
        Auto auto = new Auto("Mercedes", 500, 5);


        moto.mostraInfoMezzi();


        treno.mostraInfoMezzi();


        bicicletta.mostraInfoMezzi();


        aereo.mostraInfoMezzi();


        auto.mostraInfoMezzi();


    }
}