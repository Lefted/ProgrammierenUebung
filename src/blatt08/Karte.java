package blatt08;

public class Karte {
	enum KartenFarbe {
		KARO, HERZ, PIK, KREUZ;
	}

	static int farbenWert(KartenFarbe farbe) {
		return switch (farbe) {
		case KARO -> 9;
		case HERZ -> 10;
		case PIK -> 11;
		default -> 12;
		};
	}
}
