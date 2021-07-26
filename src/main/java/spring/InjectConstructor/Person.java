package spring.InjectConstructor;

public class Person {
	
      private String pName;
      private int pWeight;
      private int pId;
      private Cert cert;
      
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String pName, int pWeight, int pId, Cert cert) {
		super();
		this.pName = pName;
		this.pWeight = pWeight;
		this.pId = pId;
		this.cert=cert;
	}
	@Override
	public String toString() {
		return "Person [pName=" + pName + ", pWeight=" + pWeight + ", pId=" + pId + ", cert=" + cert + "]";
	}
	
	
}
