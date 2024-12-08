package Interface;
/*
Scrivere un programma che contenga un'interfaccia Forma ed un metodo chiamato calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed implementano il metodo per il calcolo dell'area.
 */
public class Triangolo implements Forma{
    private double base;
    private double altezza;
    private double somma;

    public Triangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        somma = (base * altezza)/2;
        return somma;
    }
}
