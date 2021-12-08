package blatt10;

public class SysTextFile extends SysObjectBase {

	private String type;
	private String text;

	public SysTextFile(String name, String type) {
		super(name);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return String.format("Class=SysTextFile, Name=%s, User=%s, Type=%s, Length=%d.", getName(), getOwner(), type,
				text != null ? text.length() : 0);
	}

	public static void main(String[] args) {
		SysTextFile stf = new SysTextFile("Hello", "java");
		stf.setText("public class HelloWorld{/*...*/");
		System.out.printf("%s:\n  %s\n\n", stf, stf.getText());

	}
}
