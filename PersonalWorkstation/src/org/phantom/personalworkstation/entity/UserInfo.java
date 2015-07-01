package org.phantom.personalworkstation.entity;

/**
 * 
 * @author phantom14k 用户信息
 */
public class UserInfo {
	private String id;
	private String userID;// 对应用户登录ID
	private String nickname;// 昵称

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	private String birthday;// 生日
	private int sex;// 性别
	private String personalizedSignature;// 个性签名
	private String headPortraitPath;// 头像图片地址

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String string) {
		this.userID = string;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getPersonalizedSignature() {
		return personalizedSignature;
	}

	public void setPersonalizedSignature(String personalizedSignature) {
		this.personalizedSignature = personalizedSignature;
	}

	public String getHeadPortraitPath() {
		return headPortraitPath;
	}

	public void setHeadPortraitPath(String headPortraitPath) {
		this.headPortraitPath = headPortraitPath;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", userID=" + userID + ", nickname="
				+ nickname + ", birthday=" + birthday + ", sex=" + sex
				+ ", personalizedSignature=" + personalizedSignature
				+ ", headPortraitPath=" + headPortraitPath + "]";
	}

}
