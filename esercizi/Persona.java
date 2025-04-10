//Creare una classe `Persona` con attributi privati `nome` e `età` e
// fornire metodi getter e setter per accedervi.

package esercizi;
public class Persona {
    private String nome;
    private int eta;

    public Persona (String nome, int eta){
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome(){
        return this.nome;
    }
    public int getEta(){

        return this.eta;
    }
    public void setNome(String nome){

        this.nome = nome;
    }
    public void setEta(int eta){

        this.eta =eta;
    }
}
