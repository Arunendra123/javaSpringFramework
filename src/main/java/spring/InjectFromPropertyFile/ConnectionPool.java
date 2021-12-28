package spring.InjectFromPropertyFile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class ConnectionPool {
	
	private String driver, url, user, password;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "ConnectionPool [driver=" + driver + ", url=" + url + ", username=" + user + ", password=" + password
				+ "]";
	}

	public void createConnection() {
		try {
			System.out.println(this.toString());
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println(con);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}