package org.phantom.pw.entity;

/**
 * 
 * @author phantom14k 用户对象
 * 
 */
public class User {
	private String id;
	private String email;
	private String password;
	private int userGroup;//用户分组
	private String createTime;//创建时间
	private Boolean verify;//邮箱验证

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

	public int getUserGroup() {
		return userGroup;
	}

	public void setUserGroup(int userGroup) {
		this.userGroup = userGroup;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "UserLogin [id=" + id + ", email=" + email + ", password="
				+ password + ", userGroup=" + userGroup + ", createTime="
				+ createTime + ", verify=" + verify + "]";
	}

}
