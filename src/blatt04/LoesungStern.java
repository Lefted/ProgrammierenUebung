package blatt04;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * Klasse für das Zeichnen eines Sterns
 */
public class LoesungStern extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2804516069331108429L;

	/** Konstruktor. Nichts zu ändern hier */
    public LoesungStern() {
	super();
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setSize(600, 400);
	this.setTitle("Lösung in der Klasse " + this.getClass().getName());
	this.setVisible(true);
	this.setLocationRelativeTo(null);
    }

    /** Main-Methode. Nichts zu ändern hier. */
    public static void main(String[] args) {
	new LoesungStern();
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

	this.meinStern(g); // Aufruf der selbst programmierten Methode
    }

    /**
     * Hier bitte die Lösung, um den Stern zu zeichnen
     * 
     */
    public void meinStern(Graphics g) {
	int midX = this.getWidth() / 2;
	int midY = this.getHeight() / 2;
	zeichneEinStern(g, midX, midY, 100);;
    }

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
}