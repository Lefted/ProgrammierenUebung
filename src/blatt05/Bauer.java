package blatt05;

public class Bauer {

    private String name;
    private int anzahlGefuetterterHuehner;

    public Bauer(String name) {
	this.name = name;
	this.anzahlGefuetterterHuehner = 0;
    }

    public void fuettern(Huhn huhn) {
	if (huhn.isHungrig()) {
	    huhn.setHungrig(false);
	    anzahlGefuetterterHuehner++;
	}
    }

    public void rufeHuhn(Huhn huhn) {
	System.out.println(huhn.getName());
    }

    public int berechneAnzahlHungrigerHuehner() {
	return Huhn.getAnzahlHuehner() - anzahlGefuetterterHuehner;
    }

    public String getName() {
	return this.name;
    }
}
