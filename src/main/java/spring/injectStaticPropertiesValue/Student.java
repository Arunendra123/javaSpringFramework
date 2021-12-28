package spring.injectStaticPropertiesValue;

public class Student {
              
	private String name;
	private static String univercity;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getUnivercity() {
		return univercity;
	}
	public static void setUnivercity(String univercity) {
		Student.univercity = univercity;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ",Univercity="+univercity+"]";
	}
	
}
