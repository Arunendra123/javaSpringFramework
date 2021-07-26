package spring.lifeCycleByUsingAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Samosa {
  private double price;
  
  public Samosa() {
	super();
	// TODO Auto-generated constructor stub
  } 
  public Samosa(double price) {
		super();
		this.price = price;
  }
  public double getPrice() {
	  return price;
  }
  public void setPrice(double price) {
	this.price = price;
  }
  
  @Override
  public String toString() {
	return "Samosa [price=" + price + "]";
  }
  
  @PostConstruct
  public void init() {
	  System.out.println("Doing initial configuraiton...");
  }
  
  @PreDestroy
  public void destroy() {
	  System.out.println("closing the application...");
  }
}
