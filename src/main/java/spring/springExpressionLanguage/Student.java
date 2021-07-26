package spring.springExpressionLanguage;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("s_1")
@Component
public class Student {
	    //@Value("Arunendra")
	    @Value("#{ new java.lang.String('Arunendra')}")
        private String name;
	    
	    
	    //@Value("#{12+34}")
	    //@Value("#{8>9?10:9}")
	    //@Value("#{T(java.lang.Math).sqrt(25)}")
	    @Value("#{T(java.lang.Math).PI}")
        private int rollNumber;
	    
	    @Value("#{address}")
        private List<String> address;
        
		public Student() {
			super();
			// TODO Auto-generated constructor stub
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
