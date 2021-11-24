package blatt08;

import java.awt.Point;

public class MethodenUmgebung {

	public static void main(String[] args) {

		System.out.println("Aufrunden:");
		System.out.println(String.format("0 wird zu %s", getAufgerundeteZahl(0d)));
		System.out.println(String.format("-0.8 wird zu %s", getAufgerundeteZahl(-.8d)));
		System.out.println(String.format("0.8 wird zu %s", getAufgerundeteZahl(.8d)));

		System.out.println("\nAbrunden:");
		System.out.println(String.format("0 wird zu %s", getAbgerundeteZahl(0d)));
		System.out.println(String.format("0.4 wird zu ", getAbgerundeteZahl(.4d)));
		System.out.println(String.format("0.8 wird zu %s", getAbgerundeteZahl(.8d)));
		System.out.println(String.format("-0.4 wird zu %s", getAbgerundeteZahl(-0.4)));
		System.out.println(String.format("-0.8 wird zu %s", getAbgerundeteZahl(-0.8)));

		System.out.println("\nRestlose Teilbarkeit:");
		System.out.println(String.format("12 ist durch 3 %srestlos teilbar", istRestlosTeilbar(12, 3) ? "" : "nicht "));
		System.out.println(String.format("12 ist durch 5 %srestlos teilbar", istRestlosTeilbar(12, 5) ? "" : "nicht "));

		System.out.println("\nEuklidische Distanz:");
		System.out.println(String.format("Die Euklidische Distanz von (0,0) und (1,1) ist %s",
				getEuklidischeDistanz(new Point(0, 0), new Point(1, 1))));

		System.out.println("\nKleinste Zahl:");
		System.out.println(String.format("Die kleinste Zahl von -2, 14 und 4 ist %s", getKleinsteZahl(-2, 14, 4)));
	}

	public static int getBetrag(int zahl) {
		return Math.abs(zahl);
	}

	public static int getAufgerundeteZahl(double fkz) {
		return (int) Math.ceil(fkz);
	}

	public static int getAbgerundeteZahl(double fkz) {
		return (int) Math.floor(fkz);
	}

	public static boolean istRestlosTeilbar(int zahl, int modul) {
		return zahl % modul == 0;
	}

	public static double getEuklidischeDistanz(Point p1, Point p2) {
		return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
	}

	public static int getKleinsteZahl(int zahl1, int zahl2, int zahl3) {
		return Math.min(Math.min(zahl1, zahl2), zahl3);
	}
}
