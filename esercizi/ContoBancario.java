//Creare una classe `ContoBancario` con attributi privati `saldo` e `numeroConto`, e
// fornire metodi per depositare e prelevare denaro.

package esercizi;

public class ContoBancario {

    private int saldo;
    private String numeroConto;

    public ContoBancario(int saldo, String numeroConto){
        this.saldo = saldo;
        this.numeroConto = numeroConto;

    }
    public int getSaldo(){

         return this.saldo;
    }
    public String getNumeroConto(){

        return this.numeroConto;
    }
    public void setSaldo(int saldo){

        this.saldo = saldo;
    }
    public void setNumeroConto(String numeroConto){

        this.numeroConto = numeroConto;
    }

    public void depositaDenaro(double importo){

        if (importo > 0){

            saldo += importo;

            System.out.println (" Il deposito di " + importo+ " è andato a buon fine");
        } else {
            System.out.println("L'importo non è valido");
        }
    }
    public void prelevaDenaro(double importo){

        // non si può prelevare più di quanto è disponibile
        if (importo <= saldo){

            saldo -= importo;

            System.out.println( "Il prelievo di " + importo + " è andato a buon fine");
        } else {
            System.out.println("Impossibile prelevare");
        }

    }

}