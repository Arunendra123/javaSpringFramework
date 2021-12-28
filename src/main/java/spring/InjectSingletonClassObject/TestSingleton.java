package spring.InjectSingletonClassObject;

public class TestSingleton {
 
	private static TestSingleton testSingleton;
	public TestSingleton() {
	}
	
	public static TestSingleton getInstance() {
		if(testSingleton==null) {
			return new TestSingleton();
		} else {
			return testSingleton;
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public String TestMethod() {
		return "I am Okay...";
	}
}
