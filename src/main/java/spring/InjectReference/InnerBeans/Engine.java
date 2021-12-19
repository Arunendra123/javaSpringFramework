package spring.InjectReference.InnerBeans;

public class Engine {
       private String engName;
       private int engCC;
       private int maxSpeed;
       
       
	public Engine(String engName, int engCC, int maxSpeed) {
		super();
		this.engName = engName;
		this.engCC = engCC;
		this.maxSpeed = maxSpeed;
	}
	
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEngName() {
		return engName;
	}
	public void setEngName(String engName) {
		this.engName = engName;
	}
	public int getEngCC() {
		return engCC;
	}
	public void setEngCC(int engCC) {
		this.engCC = engCC;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String toString() {
		return "Engine [engName=" + engName + ", engCC=" + engCC + ", maxSpeed=" + maxSpeed + "]";
	}
}
