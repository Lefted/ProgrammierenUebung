package k02_simpleprg;

public class HA {

	public static void main(String[] args) {
		// 2.1.1: Rechnen mit Variablen
		double laenge = 7.0;
		double breite = 3.0;
		double umfang = 2.0 * laenge + 2.0 * breite;
		double flaeche = laenge * breite;
		System.out.println(String.format("Laenge %s Breite %s Umfang %s Flaeche %s", laenge, breite, umfang, flaeche));

		// 2.1.2: Zinstabelle mit While-Schleife
		double vermoegen = 1_000.0;
		double zinssatz = 5.0;
		int anzahlJahre = 5;

		int i = 0;
		while (i < anzahlJahre) {
			System.out.println(String.format("Vermögen nach %s Jahren: %s", i, vermoegen));
			vermoegen *= (1.0 + zinssatz / 100.0);
			i++;
		}

		// 2.1.4: Zinstabelle mit For-Schleife
		for (int j = 0; j < anzahlJahre; j++) {
			System.out.println(String.format("Vermögen nach %s Jahren: %s", j, vermoegen));
			vermoegen *= (1.0 + zinssatz / 100.0);
		}
		// 2.1.5: Sporttabelle
//		2018 bis 2028 gerade jahre sind ein Sportereignis
		for (int jahr = 2018; jahr < 2029; jahr++) {
			if (jahr % 2 == 0) {
				System.out.println(
						String.format("%s gibt es eine Sommerolimpyiade oder Fußballweltmeisterschaft.", jahr));
			}
		}

		// 2.1.6: Sporttabelle
		for (int jahr = 2018; jahr < 2029; jahr++) {
			if (jahr % 2 == 0) {
				String ereignis = jahr % 4 == 0 ? "Sommerolimpyiade" : "Fußballweltmeisterschaft";
				System.out.println(String.format("%s gibt es eine %s.", jahr, ereignis));
			}
		}
	}
}
