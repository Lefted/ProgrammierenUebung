package blatt10;

public class SysDirectory extends SysObjectBase {

	private SysObjectBase[] sysObjects;

	public SysObjectBase[] getSysObjects() {
		return sysObjects;
	}

	public void setSysObjects(SysObjectBase[] sysObjects) {
		this.sysObjects = sysObjects;
	}

	public SysDirectory(String name, SysObjectBase... sysObjects) {
		super(name);
		this.sysObjects = sysObjects;
	}

	/**
	 * Strukture des Verzeichnisses ermitteln
	 * 
	 * @param indent Einrückung links (wird durch Rekursion verbreitert)
	 * @return Struktur des Verzeichnisses als String
	 */
	public String dirStructure(String indent) {
		StringBuilder result = new StringBuilder();
		result.append(indent);
		result.append(this);
		result.append("\n");

		for (SysObjectBase base : sysObjects) {
			if (base instanceof SysDirectory sysDirectory) {
				result.append(indent);
				result.append(sysDirectory.dirStructure(indent + "| - "));
			} else {
				result.append(indent);
				result.append("| - ");
				result.append(base);
				result.append("\n");
			}
		}
		return result.toString();
	}

	/**
	 * Verzeichnisse nach Ressource durchsuchen, deren Namen eine Teilzeichenkette
	 * enthält. Bei jedem Treffer wird der Name der Ressource ausgegeben.
	 * 
	 * @param searchFor Zeichenkette, nach der in den Namen der Ressourcen gesucht
	 *                  wird
	 */
	public void findName(String searchFor) {
		for (SysObjectBase sysObjectBase : sysObjects) {
			if (sysObjectBase instanceof SysDirectory sysDirectory) {
				sysDirectory.findName(searchFor);
			} else if (sysObjectBase instanceof SysTextFile textFile && textFile.getName().contains(searchFor)) {
				System.out.println(textFile.getName());
			}
		}
	}

	@Override
	public String toString() {
		return String.format("Class=SysDirectory, Name=%s, User=%s, NumberOfObjects=%d.", getName(), getOwner(),
				sysObjects.length);
	}

	public static void main(String[] args) {
		SysTextFile hello = new SysTextFile("Hello", "java");
		hello.setText("public class HelloWorld{/*...*/}");
		SysTextFile test = new SysTextFile("Test", "java");
		SysTextFile prt = new SysTextFile("PrintClass", "java");
		SysDirectory srcDir = new SysDirectory("SRC", hello, test, prt);
		SysTextFile todo = new SysTextFile("Todos", "txt");
		SysTextFile toget = new SysTextFile("Eggs", "rtm");
		SysDirectory txtDir = new SysDirectory("txt", todo, toget);

		SysDirectory home = new SysDirectory("home", srcDir, txtDir);
		srcDir.setName("SRC");
		toget.setName("Einkaufsliste");
		home.setName("HOME");
		home.setOwner("brul0001");
		System.out.printf("%s%n", home);
		System.out.println("--------------");
		System.out.printf("%s%n", home.dirStructure(""));
		System.out.println("--------------");
		String find = "e";
		System.out.println(String.format("\nFind '%s':", find));
		home.findName(find);
	}

}
