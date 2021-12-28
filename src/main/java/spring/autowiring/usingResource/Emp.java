package spring.autowiring.usingResource;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
	/* @Resource */
	@Inject
    private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	//@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
}
