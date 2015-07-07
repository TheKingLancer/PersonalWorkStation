package org.phantom.pw.entity;

/**
 * 
 * @author phantom14k �û���Ϣ id varchar(50) primary key, userid varchar(50) not
 *         null, update_time varchar(50) not null, nickname varchar(50) default
 *         null, birthday varchar(50) default null, sex int default 0,
 *         personalized_signature varchar(200) default null, head_portrait_path
 *         varchar(200) default null
 */
public class UserInfo {
	private String id;
	private String userID;// ��Ӧ�û���¼ID
	private String updateTime;//����ʱ��
	private String nickname;// �ǳ�
	private String birthday;// ����
	private int sex;// �Ա�
	private String personalizedSignature;// ����ǩ��
	private String headPortraitPath;// ͷ��ͼƬ��ַ

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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
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
		return "UserInfo [id=" + id + ", userID=" + userID + ", updateTime="
				+ updateTime + ", nickname=" + nickname + ", birthday="
				+ birthday + ", sex=" + sex + ", personalizedSignature="
				+ personalizedSignature + ", headPortraitPath="
				+ headPortraitPath + "]";
	}

}
