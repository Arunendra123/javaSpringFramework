package spring.autowiring.usingAutoWiredbyName;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

	private String name;
	private String model;
	
	private Engine engine;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public Car(String name, String model, Engine engine) {
		super();
		this.name = name;
		this.model = model;
		this.engine = engine;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", engine=" + engine + "]";
	}

}
