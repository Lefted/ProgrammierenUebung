package blatt08;

import java.util.Objects;

public class Rekursion {

	public static void main(String[] args) {
//		long n = Long.parseLong(Objects.requireNonNull(args[0]));
		System.out.println(prt1234(13));
		System.out.println(prtSqr1234(3));
		System.out.println(prt2468(14));
		xxx(5L);
		xxxIterativ(5L);
	}

	public static String prt1234(long n) {
//		if (n == 1) {
//			return String.format("%s, ", n);
//		} else {
//			return String.format("%s%s, ", prt1234(--n), (n + 1));
//		}
		return n == 1 ? String.format("%s, ", n) : String.format("%s%s, ", prt1234(--n), (n + 1));
	}

	public static String prtSqr1234(long n) {
//		if (n == 1) {
//			return String.format("%s, ", n * n);
//		} else {
//			return String.format("%s%s, ", prtSqr1234(--n), (n + 1) * (n + 1));
//		}
		return n == 1 ? String.format("%s, ", n * n) : String.format("%s%s, ", prtSqr1234(--n), (n + 1) * (n + 1));
	}

	public static String prt2468(long n) {
		if (n % 2 == 1)
			n--;
//		if (n == 2) {
//			return String.format("%s, ", n);
//		} else {
//			return String.format("%s%s, ", prt2468(n-=2), (n+2));
//		}
		return n == 2 ? String.format("%s, ", n) : String.format("%s%s, ", prt2468(n -= 2), (n + 2));
	}

	public static void xxx(long n) {
		if (n > 0L) {
			System.out.println(n);
			xxx(n - 1);
		} else { // Rekursionsbasis
		}
	}
	
	public static void xxxIterativ(long n) {
		while (n > 0L) {
			System.out.println(n);
			--n;
		}
	}
}
