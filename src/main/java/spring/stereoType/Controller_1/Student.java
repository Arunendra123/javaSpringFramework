package spring.stereoType.Controller_1;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("s_1")
@Component
public class Student {
	    @Value("Arunendra")
        private String name;
	    
	    @Value("12")
        private int rollNumber;
	    
	    @Value("#{address}")
        private List<String> address;
        
		public Student() {
		}
		
		public Student(String name, int rollNumber, List<String> address) {
			super();
			this.name = name;
			this.rollNumber = rollNumber;
			this.address = address;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRollNumber() {
			return rollNumber;
		}
		public void setRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
		}
		
		public List<String> getAddress() {
			return address;
		}

		public void setAddress(List<String> address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", rollNumber=" + rollNumber + ", address=" + address + "]";
		}

}
