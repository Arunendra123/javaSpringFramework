package spring.InjectReference.InnerBeans;

public class Vehicle {
	 private String vName;
     private int vWheel;
     private Engine vEng;
      
	public Vehicle(String vName, int vWheel, Engine vEng) {
		super();
		this.vName = vName;
		this.vWheel = vWheel;
		this.vEng = vEng;
	}
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public int getvWheel() {
		return vWheel;
	}
	public void setvWheel(int vWheel) {
		this.vWheel = vWheel;
	}
	public Engine getvEng() {
		return vEng;
	}
	public void setvEng(Engine vEng) {
		this.vEng = vEng;
	}
	@Override
	public String toString() {
		return "Vehicle [vName=" + vName + ", vWheel=" + vWheel + ", vEng=" + vEng + "]";
	}
}
