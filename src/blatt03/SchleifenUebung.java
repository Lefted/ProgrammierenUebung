package blatt03;

public class SchleifenUebung {

	private static final int ENDWERT = 4;
	private static final int STARTWERT = -4;
	private static final double SCHRITTWEITE = 0.5d;

	public static void main(String[] args) {
		System.out.println("Alle Quadratzahlen von -4...4 in 0.5er-Schritten:");
		for (double i = STARTWERT; i <= ENDWERT; i += SCHRITTWEITE) {
			System.out.println(String.format("x, x^2: %s, %s", i, Math.pow(i, 2)));
		}

		System.out.println("Alle Sinus, Cosinus von -4 ... 4 in 0.5er Schritten:");
		for (double i = STARTWERT; i <= ENDWERT; i+=SCHRITTWEITE) {
			System.out.println(String.format("x, sin(x), cos(x): %s, %s, %s", i, Math.sin(i), Math.cos(i)));
		}
	}
}
