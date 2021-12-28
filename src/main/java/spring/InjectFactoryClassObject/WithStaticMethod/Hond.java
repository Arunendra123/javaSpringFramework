package spring.InjectFactoryClassObject.WithStaticMethod;

import org.springframework.beans.factory.annotation.Value;

public class Hond implements Car{

	private String name="Honda jee";
	public String getCarName() {
		return name;
	}
}
