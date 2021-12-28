package spring.Annotation;

import org.springframework.beans.factory.annotation.Value;

public class Teacher {

	@Value("Dheeru Dubey")
	private String name;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + "]";
	}
	
	
}
