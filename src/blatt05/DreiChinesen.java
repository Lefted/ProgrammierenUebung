package blatt05;

import java.util.stream.Stream;

public class DreiChinesen {
    static final String text = "Drei Chinesen mit dem Kontrabass\n" + "saßen auf der Straße und erzählten sich was.\n"
	+ "Da kam ein Mann: Ja was ist denn das?\n" + "Drei Chinesen mit dem Kontrabass.";

    /**
     * Einen Text zentriert ausgeben. Es genügt eine Lösung für nichtproportionale
     * Schriftarten.
     * 
     * @param text
     *             Text mit mehreren Zeilen (durch '\n' abgetrennt)
     */
    static void printCentered(String text) {
	String[] zeilen = text.split("\n");
	int maxZeichen = Stream.of(zeilen).mapToInt(String::length).max().getAsInt();
	for (String zeile : zeilen) {
	    int diffZeichen = (maxZeichen - zeile.length()) / 2;
	    System.out.println(String.format("%s%s", " ".repeat(diffZeichen), zeile));
	}
    }

    /**
     * Vokale in Text ersetzen.
     * 
     * @param text
     *                    Text mit Vokalen
     * @param replacement
     *                    Ersatz für Vokale
     * @return Text mit geänderten Vokalen
     */
    static String changeVowels(String text, String replacement) {
	return text.replaceAll("[aeiou]", replacement);
    }

    public static void main(String[] args) {
	DreiChinesen.printCentered(text);
	DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "i"));
	DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "ü"));
    }

}
