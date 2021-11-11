package blatt05;

public class Huhn {
    
    private static int anzahlHuehner;

    private final String name;
    private boolean hungrig;
    
    public Huhn(String name) {
	this.name = name;
	this.hungrig = true;
	anzahlHuehner++;
    }

    public void setHungrig(boolean hungrig) {
	this.hungrig = hungrig;
    }
    
    public boolean isHungrig() {
	return this.hungrig;
    }
    
    public String getName() {
	return this.name;
    }
    
    public static int getAnzahlHuehner() {
	return anzahlHuehner;
    }
}
