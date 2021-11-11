package blatt05;

public class BauernhofTest {

    public static void main(String[] args) {
	final Bauer bauer = new Bauer("Walter");
	final Bauer bauer2 = new Bauer("Jochen");
	final Huhn[] hühner = {
		new Huhn("Heidrun"), new Huhn("Heike"), new Huhn("Hannelore")
	};

	for (Huhn huhn : hühner) {
	    bauer.rufeHuhn(huhn);
	}
	
	bauer.fuettern(hühner[0]);
	bauer.fuettern(hühner[1]);
	bauer2.fuettern(hühner[2]);
	
	System.out.println("Satt?");
	System.out.println(bauer.berechneAnzahlHungrigerHuehner() + bauer2.berechneAnzahlHungrigerHuehner());
    }
}
