package blatt10;

public abstract class SysObjectBase {

	private String name;
	private String owner;

	protected SysObjectBase(String name) {
		this.name = name;
		this.owner = System.getenv("USERNAME");
	}

	public String getName() {
		return name;
	}

	public String getOwner() {
		return owner;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return String.format("Class=SysObjectBase, Name=%s, User=%s.", name, owner);
	}

}
