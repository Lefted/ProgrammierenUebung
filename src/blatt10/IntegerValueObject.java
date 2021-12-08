package blatt10;

public class IntegerValueObject {

	private final int i;

	public IntegerValueObject(int i) {
		this.i = i;
	}

	/**
	 * Werte zusammenzählen
	 * 
	 * @param j zweiter Summand
	 * @return this.i + j als neues Value-Objekt
	 */
	public IntegerValueObject add(int j) {
		return new IntegerValueObject(this.i + j);
	}

	/**
	 * Werte ausmultiplizieren
	 * 
	 * @param j zweiter Faktor
	 * @return this.i * j als neues Value-Objekt
	 */
	public IntegerValueObject mul(int j) {
		return new IntegerValueObject(this.i * j);
	}

	public int getValue() {
		return i;
	}

	@Override
	public String toString() {
		return String.valueOf(i);
	}

	public static void main(String[] args) {
		System.out.println(new IntegerValueObject(2).mul(3).add(4).mul(5));
	}
}
