package spring.dependsOn;

public class A {
	
	private String name;

	public A() {
		System.out.println("Object A");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}

}
