package blatt06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStatistik {

    public static void main(String[] args) {
	int[] werte = { 35, 7, 90, 26, 92, 54, 24, 65, 2, 67, 43, 26, 80, 92, 7, 40, 67, 66, 31, 45, 7, 100, 96, 93, 12, 20, 57, 22, 62, 51 };
	Arrays.sort(werte);

	double mittelwert = IntStream.of(werte).average().getAsDouble();
	// int minwert = IntStream.of(werte).min().getAsInt();
	// int maxwert = IntStream.of(werte).max().getAsInt();
	int minwert = werte[0];
	int maxwert = werte[werte.length - 1];
	double median;

	if (werte.length % 2 == 1) {
	    median = werte[werte.length / 2 + 1];
	} else {
	    median = (werte[werte.length / 2] + werte[werte.length / 2 + 1]) / 2D;
	}

	IntStream.of(werte).mapToObj(w -> String.format("%s ", w)).forEach(System.out::print);
	System.out.println("\n-------------------------------------");
	System.out.println(String.format("Länge %s", werte.length));
	System.out.println(String.format("mittelwert %s", mittelwert));
	System.out.println(String.format("minwert %s", minwert));
	System.out.println(String.format("maxwert %s", maxwert));
	System.out.println(String.format("median %s", median));

	System.out.println("---------------------------------------");
	double[][] schadensverteilung = { { 0, 0.744 }, { 350, 0.182 }, { 1_500, 0.061 }, { 5_000, 0.013 } };
	double erwartungswert = 0;
	for (double[] zuordnung : schadensverteilung) {
	    erwartungswert += zuordnung[0] * zuordnung[1];
	}
	
	System.out.println(String.format("Erwartungswert %s", erwartungswert));
    }
}
