package blatt11;

public class ExceptionsTest {

	/**
	 * Zwei Werte dividieren
	 * 
	 * @param z, Zahl die dividiert wird (Zähler)
	 * @param n, Zahl durch die dividiert wird (Nenner)
	 * @return z / n
	 */
	public static int div(int z, int n) {
		try {
			return z / n;
		} catch (ArithmeticException e) {
			System.err.println(String.format("Fehlergrund: \"%s\"", e.getMessage()));
			e.printStackTrace();
			return Integer.MAX_VALUE;
		}
	}

	public static void main(String[] args) {
		System.out.println(div(12, 3));
		System.out.println(div(12, 0));
	}
}
