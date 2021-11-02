package blatt02;

import java.util.Scanner;

public class Bankkonto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte entscheiden Sie welche der folgenden Berechnungen Sie ausführen möchten:");
		System.out.println("1) Sparplan mit Zinseszins");
		System.out.println("2) Sparplan ohne Zinseszins");
		System.out.println("3) Erforderliche Dauer eines Sparziels mit Zineszins");

		int auswahl = sc.nextInt();

		System.out.println("Bitte geben Sie ihr Startguthaben ein: ");
		double guthaben = sc.nextDouble();

		System.out.println("Bitte geben Sie den Zinssatz (in %) ein: ");
		double zinssatz = sc.nextInt() / 100d;

		switch (auswahl) {
		case 1:
			berechneSparplanMitZinseszins(sc, guthaben, 1_000, zinssatz);
			break;
		case 2:
			berechneSparplanOhneZinseszins(sc, guthaben, zinssatz);
			break;
		case 3:
			sparplanMitZineszins(sc, guthaben, zinssatz);
			break;
		default:
			System.err.println("Ungültige Eingabe. Bitte starten Sie das Programm neu!");
			break;
		}

		sc.close();
	}

	// von Theo
	public static void berechneSparplanOhneZinseszins(Scanner sc, double guthaben, double zinssatz) {
		System.out.println("Bitte geben Sie die Laufzeit (in Jahren) ein:");
		int jahre = sc.nextInt();
		
		System.out.println("Bitte geben Sie Ihre Sparrate ein:");
		double sparrate = sc.nextDouble();

		double abbuchwert = 0.0;
		double gesamtguthaben = 0.0;
		
		for (int i = 2; i <= jahre; i++) {
			abbuchwert = abbuchwert + guthaben * zinssatz;
			guthaben = guthaben + sparrate;
			gesamtguthaben = abbuchwert + guthaben;
			
			System.out.println("Guthaben einschließlich des abgehobenden Betrags nach dem " + i + ". Jahr: " + gesamtguthaben);
		}
	}
	
	// von Moritz
	public static void sparplanMitZineszins(Scanner sc, double guthaben, double zinssatz) {
		int jahr = 0;

		System.out.println("Bitte geben Sie Ihre Sparrate (jährlich) ein: ");
		double sparrate = sc.nextDouble();

		System.out.println("Bitte geben Sie Ihr Sparziel ein: ");
		double sparziel = sc.nextDouble();

		while (guthaben <= sparziel) {
			guthaben += guthaben * zinssatz;
			guthaben += sparrate;
			jahr++;
		}

		System.out.println(String.format("Guthaben nach dem %s. Jahr: %s", jahr, guthaben));
//		 System.out.println("Guthaben nach dem " + jahr + ". Jahr: " + guthaben);
	}

	// von Jenny
	public static void berechneSparplanMitZinseszins(Scanner sc, double guthaben, double sparrate,
			double zinssatz) {
		System.out.println("Bitte geben Sie die Laufzeit (in Jahren) ein:");
		int jahre = sc.nextInt();

		for (int i = 1; i <= jahre; i++) {
			guthaben = guthaben * (1 + zinssatz);
			guthaben = guthaben + sparrate;

			System.out.println("Guthaben nach dem " + i + ". Jahr " + guthaben);
		}
	}
}
