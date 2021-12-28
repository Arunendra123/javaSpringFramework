package spring.dependsOn;

public class C {
	private String name;
  
	public C() {
		System.out.println("Object C");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
