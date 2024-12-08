package Interface;
/*
Scrivere un programma che contenga un'interfaccia Forma ed un metodo chiamato calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed implementano il metodo per il calcolo dell'area.
 */
public class Rettangolo implements Forma{
    private double lunghezza;
    private double altezza;
    private double somma;

    public Rettangolo(double lunghezza, double altezza) {
        this.lunghezza = lunghezza;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        somma = lunghezza * altezza;
        return somma;
    }
}
