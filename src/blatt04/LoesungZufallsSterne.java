package blatt04;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * Klasse für das zufällige Zeichnen von Sternen
 */
public class LoesungZufallsSterne extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = -3820765099990654922L;

    /** Konstruktor. Nichts zu ändern hier */
    public LoesungZufallsSterne() {
	super();
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setSize(1024, 768);
	this.setTitle("Lösung in der Klasse " + this.getClass().getName());
	this.setVisible(true);
    }

    /**
     * Paint-Methode. Nichts zu ändern hier. Diese Methode
     * wird beim Öffnen des Fensters automatisch aufgerufen.
     * Die Methode wird auch aufgerufen, wenn die Größe des Fensters
     * verändert wird.
     * 
     * @param g Grafik, auf die gezeichnet wird.
     */
    public void paint(Graphics g) {
	/* Löschen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
	g.clearRect(0, 0, this.getWidth(), this.getHeight());

	this.meineZufallsSterne(g); // Aufruf der selbst programmierten Methode
    }

    /** Main-Methode. Nichts zu ändern hier. */
    public static void main(String[] args) {
	new LoesungZufallsSterne();
    }

    /**
     * Bitte ab hier Lösung zum Zeichnen der zufälligen Sterne entwickeln.
     */
    /**
     * 1. Teilaufgabe: Methode, um einen Stern zu zeichnen.
     * 
     * @param g    Grafikbereich, auf dem gezeichnet wird
     * @param midX x-Koordinate des Mittelpunkts des Sterns
     * @param midY y-Koordinate des Mittelpunkts des Sterns
     * @param r    Radius des Sterns
     */
    public void zeichneEinStern(Graphics g, int midX, int midY, int r) {
	int n = 48;
	int rUsed = r;

	for (int i = 0; i < n; i++) {
	    double phi = i * (2 * Math.PI) / n;

	    if (i % 2 == 0) {
		g.setColor(Color.BLUE);
		rUsed = r;
	    } else {
		g.setColor(Color.RED);
		rUsed = r / 2;
	    }

	    int x = (int) (rUsed * Math.cos(phi));
	    int y = (int) (rUsed * Math.sin(phi));
	    g.drawLine(midX, midY, midX + x, midY + y);
	}
    }

    /**
     * 2. Teilaufgabe: Sterne zufällig platzieren mit zufälligem Radius
     */

    public void meineZufallsSterne(Graphics g) {
	// 60 Sterne zufällig groß und zufällig verteilt zeichnen
	for (int i = 0; i < 60; i++) {
	    int midX = (int) (Math.random() * this.getWidth());
	    int midY = (int) (Math.random() * this.getHeight());
	    int radius = (int) (Math.random() *  100 + 10);
	    System.out.println(midX);
	    zeichneEinStern(g, midX, midY, radius);
	}
    }
}
