package spring.dependsOn;

public class B {

	private String name;

	public B() {
		System.out.println("Object B");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
