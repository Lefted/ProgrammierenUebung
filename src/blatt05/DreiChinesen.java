package blatt05;

public class DreiChinesen {
	static final String text = 
			  "Drei Chinesen mit dem Kontrabass\n" 
			+ "saßen auf der Straße und erzählten sich was.\n"
			+ "Da kam ein Mann: Ja was ist denn das?\n"
			+ "Drei Chinesen mit dem Kontrabass.\n\n"
			;

	/**
	 * Einen Text zentriert ausgeben. Es genügt eine Lösung für nichtproportionale
	 * Schriftarten.
	 * 
	 * @param text
	 *            Text mit mehreren Zeilen (durch '\n' abgetrennt)
	 */
	static void printCentered(String text) {
		String[] zeilen = text.split("\n");
		for (String zeile : zeilen) {
			System.out.println(String.format("%-100s", zeile));
		}
	}

	/**
	 * Vokale in Text ersetzen.
	 * 
	 * @param text
	 *            Text mit Vokalen
	 * @param replacement
	 *            Ersatz für Vokale
	 * @return Text mit geänderten Vokalen
	 */
	static String changeVowels(String text, String replacement) {
		return text; // TODO
	}

	public static void main(String[] args) {
		DreiChinesen.printCentered(text);
		DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "i"));
		DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "ü"));
	}

}
