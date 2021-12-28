package spring.Annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("s_1")
@Component
public class Student {
	    @Value("#{ new java.lang.String('Arunendra')}")
        private String name;

	    @Value("#{12+34}")
        private int rollNumber;
	    
	    @Autowired
	    private Teacher teacher;
	    
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

		public int getRollNumber() {
			return rollNumber;
		}

		public void setRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
		}

		public Teacher getTeacher() {
			return teacher;
		}

		public void setTeacher(Teacher teacher) {
			this.teacher = teacher;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", rollNumber=" + rollNumber + ", teacher=" + teacher + "]";
		}
}
