package org.phantom.pw.entity;

/**
 * 
 * @author phantom14k �û�ͳ����Ϣ
 *
 */
public class UserAccountInfo {
	private String id;
	private String userID;
	private String updateTime;// ����ʱ��
	private int PV;// ������
	private int articleAmount;// ������
	private int messageAmount;// ������

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public int getPV() {
		return PV;
	}

	public void setPV(int pV) {
		PV = pV;
	}

	public int getArticleAmount() {
		return articleAmount;
	}

	public void setArticleAmount(int articleAmount) {
		this.articleAmount = articleAmount;
	}

	public int getMessageAmount() {
		return messageAmount;
	}

	public void setMessageAmount(int messageAmount) {
		this.messageAmount = messageAmount;
	}

	@Override
	public String toString() {
		return "UserAccountInfo [id=" + id + ", userID=" + userID
				+ ", updateTime=" + updateTime + ", PV=" + PV
				+ ", articleAmount=" + articleAmount + ", messageAmount="
				+ messageAmount + "]";
	}

}
