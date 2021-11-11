package blatt04;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Zusatzaufgabe:
 * Klasse für das Zeichnen von Sternen entlang einer Spirale.
 * Wir leiten diesesmal von LoesungZufallsSterne ab, um die Methode
 * zeichneEinenStern wiederverwenden zu können.
 */
public class LoesungSterneAufSpirale extends LoesungZufallsSterne {

    /**
     * 
     */
    private static final long serialVersionUID = 3227618498328405359L;

    /** Konstruktor. Nichts zu ändern hier */
    public LoesungSterneAufSpirale() {
	super();
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setSize(1024, 768);
	this.setTitle("Lösung in der Klasse " + this.getClass().getName());
	this.setVisible(true);
	this.setLocationRelativeTo(null);
    }

    /** Main-Methode. Nichts zu ändern hier. */
    public static void main(String[] args) {
	new LoesungSterneAufSpirale();
    }

    /**
     * Bitte ab hier Lösung zum Zeichnen der Sterne auf der Spirale entwickeln.
     */
    public void paint(Graphics g) {
	/* Löschen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
	g.clearRect(0, 0, this.getWidth(), this.getHeight());

	for (int j = 1; j < 14; j++) {
	    double r = j*j * 0.5+10;
	    int n = 48;
	    double rUsed = r;
	    double p = 0.58d;
	    double t = 3d;
	    int midX = (int) (t* rUsed * Math.sin(j*p));
	    
	    int midY = (int) (t* rUsed * Math.cos(j*p));
	    midX += this.getWidth() / 2;
	    midY += this.getHeight() / 2;

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
}