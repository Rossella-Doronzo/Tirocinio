package esercizi.giochi;

public class TestVideogioco {

    public static void main (String [] args){

        MagoMerlino mago = new MagoMerlino("Merlino", "mago", 1,8, 10, 3 );
        Ginevra regina = new Ginevra ("Ginevra", "regina", 3);
        Lancillotto cavaliere = new Lancillotto("Lancillotto", "cavaliere", 2);
        ReArtu re = new ReArtu("Artù", "re", 5);

        mago.mostraDettagliPersonaggio();
        mago.esegueAbilita();

        regina.mostraDettagliPersonaggio();
        regina.esegueAbilita();

        cavaliere.mostraDettagliPersonaggio();
        cavaliere.esegueAbilita();

        re.mostraDettagliPersonaggio();
        re.esegueAbilita();



    }

}
