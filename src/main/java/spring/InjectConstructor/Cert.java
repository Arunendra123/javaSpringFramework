package spring.InjectConstructor;

public class Cert {
    private String cName;

	public Cert(String cName) {
		super();
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Cert [cName=" + cName + "]";
	}
    
}
