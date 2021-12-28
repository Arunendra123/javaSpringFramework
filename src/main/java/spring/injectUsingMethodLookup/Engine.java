package spring.injectUsingMethodLookup;

public class Engine {

	private String name;

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Engine(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + "]";
	}
	
	
}
