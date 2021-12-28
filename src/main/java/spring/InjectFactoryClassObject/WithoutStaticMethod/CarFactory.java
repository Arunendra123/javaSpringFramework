package spring.InjectFactoryClassObject.WithoutStaticMethod;

public class CarFactory {

	private static String carfactory;
	
	public CarFactory() {
	}

	public void setCarfactory(String carfactory) {
		CarFactory.carfactory = carfactory;
	}

	public Car getInstance() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		return (Car) Class.forName("spring.InjectFactoryClassObject.WithoutStaticMethod"+"."+carfactory).newInstance();
	}
}
