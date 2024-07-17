package kr.co.dong.domain;

public class LoginVO {
	private String userID;
	private String name;
	private String password;
	
	public LoginVO() {}

	public LoginVO(String userID, String name, String password) {
		this.userID = userID;
		this.name = name;
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginVO [userID=" + userID + ", name=" + name + ", password=" + password + "]";
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}//end class
