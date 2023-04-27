public class User {
	public String name;
	private final static float LIBRARY_COST = 10;
	public User(String name) {
		this.name=name;
	}
	public float costOfLibrary() {
		return LIBRARY_COST;
	}
}

class Teacher extends User{
	private final static float LIBRARY_COST = 2;
	public Teacher(String name) {
		super(name);
	}
	public float costOfLibrary() {
		return LIBRARY_COST;
	}
}

class HeadMaster extends User{
	private final static float LIBRARY_COST = 0;
	public HeadMaster(String name) {
		super(name);
	}
	public float costOfLibrary() {
		return LIBRARY_COST;
	}
}
