package spring.InjectFactoryClassObject.WithStaticMethod;

public class CarFactory {

	private static String carfactory;
	
	public CarFactory() {
	}

	public static void setCarfactory(String carfactory) {
		CarFactory.carfactory = carfactory;
	}

	public static Car getInstance() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		return (Car) Class.forName("spring.InjectFactoryClassObject.WithStaticMethod"+"."+carfactory).newInstance();
	}
}
