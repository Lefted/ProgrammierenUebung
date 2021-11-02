package blatt03;
import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse, um ein Raster zu malen
 */
public class LoesungKegel extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3395714487670611590L;

	/** Konstruktor. Nichts zu ändern hier */
    public LoesungKegel(){
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(610,417);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName()); 
        this.setVisible(true);
    }

    /** Main-Methode. Nichts zu ändern hier. */
    public static void main(String[] args){
    	new LoesungKegel();
    }
   
    /** Paint-Methode. Nichts zu ändern hier. Diese Methode 
     *  wird beim Öffnen des Fensters automatisch aufgerufen. 
     *  Die Methode wird auch aufgerufen, wenn die Größe des Fensters
     *  verändert wird. 
     *  @param g Grafik, auf die gezeichnet wird.
     *  */
    public void paint(Graphics g){
    	/* Löschen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
    	g.clearRect(0, 0, this.getWidth(), this.getHeight());
    	
    	
    	this.meinKegel(g); // Aufruf der selbst programmierten Methode
    }
   
	/** 
	 * Hier bitte die Lösung, um den Kegel zu zeichnen
	 * 
	 */
   public void meinKegel(Graphics g){
	   int x25 = this.getWidth() / 4;
	   int y25 = this.getHeight() / 4;
	   int x75 = this.getWidth() * 3 / 4;
	   int y75 = this.getHeight() * 3 / 4;
	   
	   g.setColor(Color.BLACK);
	   g.drawLine(x25,y25,x75,y25);
	   g.drawLine(x75,y25,x25,y75);
	   g.drawLine(x25,y75,x75,y75);
	   g.drawLine(x25,y25,x75,y75);
	   
	   g.setColor(Color.GRAY);
	   for (int i = 0; i < 40; i++) {
//		   int x = (int) (((i / 40) * (this.getWidth() * 0.5)));
		   int x = (i*this.getWidth()) / (39*2);
		  g.drawLine(x25+x,y25,x75-x,y75);
	   }
   } 
}