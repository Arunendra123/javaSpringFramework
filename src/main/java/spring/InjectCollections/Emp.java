package spring.InjectCollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
    private String empName;
    private List<String> empNumber;
    private Set<String> empAddress;
    private Map<String,String> empCourses;
    
	public Map<String, String> getEmpCources() {
		return empCourses;
	}

	public void setEmpCources(Map<String, String> empCources) {
		this.empCourses = empCources;
	}


	public Emp(String empName, List<String> empNumber, Set<String> empAddress, Map<String, String> empCourses) {
		super();
		this.empName = empName;
		this.empNumber = empNumber;
		this.empAddress = empAddress;
		this.empCourses = empCourses;
	}


	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<String> getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(List<String> empNumber) {
		this.empNumber = empNumber;
	}

	public Set<String> getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Set<String> empAddress) {
		this.empAddress = empAddress;
	}

	public Map<String, String> getEmpCourses() {
		return empCourses;
	}

	public void setEmpCourses(Map<String, String> empCourses) {
		this.empCourses = empCourses;
	}

	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", empNumber=" + empNumber + ", empAddress=" + empAddress + ", empCourses="
				+ empCourses + "]";
	} 
	
}
