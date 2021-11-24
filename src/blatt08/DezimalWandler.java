package blatt08;

public class DezimalWandler {

	/**
	 * Zeichen in int-Zahl wandeln
	 * 
	 * 39
	 * 
	 * @param c: Gegebene Ziffer aus 0 ... 9 und A ... Z
	 * @return Dezimaler Wert der Ziffer
	 */
	int zifferNachInt(char c) {
//		assert 0 <= i && i <= ZIFFER_MAX;
//		char ret;
//		if (0 <= i && i <= 9)
//			ret = (char) (i + '0');
//		else if (10 <= i && i <= ZIFFER_MAX)
//			ret = (char) (i - 10 + 'A');
//		else
//			ret = '-'; // Unzulässige Zahl
//		return ret;
		assert ('0' <= c && c <= '9') || ('A' <= c && c <= 'Z');
		int ret;
		if ('0' <= c && c <= '9')
			ret = c - '0';
		else if ('A' <= c && c <= 'Z')
			ret = c - 'A' + 10;
		else
			ret = -1; // Unzulässiger char
		return ret;
	}

	/**
	 * Gegebene Zahl zur Basis k in Dezimalzahl umrechnen
	 * 
	 * @param zahlBasisK: Zeichenkette mit Ziffern zur Basis k
	 * @param k:          Basis
	 * @return umgerechnete Dezimalzahl
	 */
	long basisKinDezimal(String zahlBasisK, int k) {
		if (zahlBasisK.length() == 1) {
			return zifferNachInt(zahlBasisK.charAt(0));
		} else {
			return zifferNachInt(zahlBasisK.charAt(zahlBasisK.length()-1)) + k * basisKinDezimal(zahlBasisK.substring(0, zahlBasisK.length() - 1), k);
		}
	}

	public static void main(String[] args) {
		DezimalWandler dezimalWandler = new DezimalWandler();
		Object[][] tests = {
				// Dimensionen: [n Tests][String_Basis_k, Basis k, Entsprechende Dezimalzahl]
				{ "42", 10, 42 }, { "1101", 2, 13 }, { "I", 20, 18 }, { "JJ", 20, 399 }, { "1000", 20, 8000 },
				{ "V", 32, 31 }, { "VV", 32, 1023 }, { "100", 32, 1024 }, };
		// Tests, ob Wandlung Dezimal -> Basis_k OK:
		for (Object[] test : tests) {
			long wunschErgebnis = (int) test[2];
			int basis = (int) test[1];
			String zahlBasisK = (String) test[0];
			long resultat = dezimalWandler.basisKinDezimal(zahlBasisK, basis);
			System.out.printf("%6s zur Basis %2d ist dezimal == %8d (%s)\n", zahlBasisK, basis, resultat,
					(resultat == wunschErgebnis ? "OK" : "falsch"));
		}
	}
}
