package Interface;
/*
Scrivere un programma che contenga un'interfaccia Forma ed un metodo chiamato calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed implementano il metodo per il calcolo dell'area.
 */
public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(3.4,2.5);
        Triangolo triangolo = new Triangolo(3.5,4.5);

        System.out.println("L'area del Rettangolo è: "+ rettangolo.calcolaArea());
        System.out.println("L'area del Triangolo è: "+ triangolo.calcolaArea());
    }
}
