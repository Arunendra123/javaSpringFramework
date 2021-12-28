package spring.autowiring.usingResource;

public class Address {
	
      private String vill;
      private String post;
      private String dist;
      
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String vill, String post, String dist) {
		super();
		this.vill = vill;
		this.post = post;
		this.dist = dist;
	}
	public String getVill() {
		return vill;
	}
	public void setVill(String vill) {
		this.vill = vill;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	@Override
	public String toString() {
		return "Address [vill=" + vill + ", post=" + post + ", dist=" + dist + "]";
	}
}
