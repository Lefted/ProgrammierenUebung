package blatt05;

import java.util.Objects;

/** Beispiel für Referenzen: Klasse für Mitarbeiter-Raumzuordnung */
public class Raumzuordnung {

    private Raum raum; // Referenz auf Raum
    private Person nutzer; // Referenz auf Nutzer/in
    private String grund; // Grund für die Zuordnung (z.B. "Büroraum", "Labor")

    /** Konstruktor */
    public Raumzuordnung(Raum raum, Person nutzer, String grund) {
	Objects.requireNonNull(raum);
	Objects.requireNonNull(nutzer);
	Objects.requireNonNull(grund);
	if (grund.length() < 3) {
	    throw new IllegalArgumentException("Grund muss mindestens drei Buchstaben lang sein");
	}
	this.raum = raum;
	this.nutzer = nutzer;
	this.grund = grund;
    }

    /**
     * Konstruktor
     */
    public Raumzuordnung(Raum raum, Person nutzer) {
	Objects.requireNonNull(raum);
	Objects.requireNonNull(nutzer);
	this.raum = raum;
	this.nutzer = nutzer;
    }

    public void print() {
	this.getNutzer().print();
	System.out.print(" nutzt den Raum: ");
	this.getRaum().print();
	if (this.grund != null) {
	    System.out.print(String.format(" als %s", this.grund));
	}
    }

    Raum getRaum() {
	return this.raum;
    }

    Person getNutzer() {
	return this.nutzer;
    }

    public static void main(String[] a) {
	// Bröckl nutzt den Raum E 212a
	Person ub = new Person("Ulrich", "Bröckl");
	Raum e212a = new Raum("e 212a", 2);
	Raumzuordnung ub2e212a = new Raumzuordnung(e212a, ub, "Büro");
	ub2e212a.print();

	// Bröckl nutzt außerdem den Raum E 201
	Raumzuordnung ub2e201 = new Raumzuordnung(new Raum("e 201", 77, true), // keine Zwischenvariable für e201 nötig...
	    ub);
	// Den Raum dieser Zuordnung ausgeben:
	System.out.print("\n     Außerdem: ");
	ub2e201.getRaum().print();
	System.out.println("\n");

	// Vogelsang nutzt den Raum E 209
	Raumzuordnung hv2e209 = new Raumzuordnung(new Raum("e 209", 3), new Person("Holger", "Vogelsang"), "Büro");
	hv2e209.print();

    }

    public String getGrund() {
	return grund;
    }
}
