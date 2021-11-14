package zusatzuebung.src;

import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame {
    
    private static final long serialVersionUID = -8489445922253259107L;
    public static int width = 1024;
    public static int height = 786;

    /**
     * Konstruktor aus der Übung
     */
    public Grid() {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(width, height);
        this.setTitle("Plotter");
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Grid();
    }

    // TODO: implementiere ein Koordinatenkreuz
    /**
     * coordinates zeichnet ein Koordinatenkreuz.
     */
    public void coordinates(Graphics g) {

    }

    // TODO: implementiere eine Achsenbeschriftung
    /**
     * labels zeichnet Achsenbeschriftungen bei ganzen Zahlen.
     */
    public void labels(Graphics g) {

    }

    // TODO: implementiere einen Funktionsplot.
    /**
     * plot zeichnet die durch die Expression e angegebene Funktion in der angegebenen Farbe in g.
     */
    public void plot(Graphics g, Expression e, Color c) {

    }

    /**
     * paint-Methode wie in der Vorlesung
     */
    public void paint(Graphics g) {
        coordinates(g);
        labels(g);
        // TODO: Hier weitere Beispiele einfügen
        // TODO: An diese Stelle sollst Du auch in den späteren Aufgabenteilen jeweils Funktionen in unterschiedlicher Syntax schreiben.
        plot(g, new HardcodedSin(), Color.RED);
    }
}
