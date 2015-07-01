package org.phantom.personalworkstation.entity;

/**
 * 
 * @author phantom14k 用户登录实体
 */
public class UserLogin {
	private String id;
	private String email;
	private String password;
	private Boolean verify;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getVerify() {
		return verify;
	}

	public void setVerify(Boolean verify) {
		this.verify = verify;
	}

	@Override
	public String toString() {
		return "UserLogin [id=" + id + ", email=" + email + ", password="
				+ password + ", verify=" + verify + "]";
	}

}
