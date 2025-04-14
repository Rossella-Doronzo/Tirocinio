package esercizi.geometria;

public class TestForma {

    public static void main (String []args){

       Cerchio cerchio = new Cerchio (10);
       Quadrato quadrato = new Quadrato (8);
       Rettangolo rettangolo = new Rettangolo(5, 8);

      System.out.println ("L'area del cerchio è: " + cerchio.calcolaArea());
      System.out.println ("L'area del quadrato è: " + quadrato.calcolaArea());
      System.out.println ("L'area del rettangolo è: " + rettangolo.calcolaArea());

    }
}
