package Serialization;

import java.io.Serializable;

public class UserData implements Serializable {
	private int id;
	private String name;
	transient String password;
	public UserData(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}

}
