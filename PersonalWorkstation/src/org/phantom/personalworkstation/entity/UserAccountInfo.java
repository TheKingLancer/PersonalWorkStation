package org.phantom.personalworkstation.entity;
/**
 * 
 * @author phantom14k 用户统计信息
 *
 */
public class UserAccountInfo {
	private String id;
	private String userID;
	private int PV;
	private int articleAmount;
	private int messageAmount;

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
		return "UserAccountInfo [id=" + id + ", userID=" + userID + ", PV="
				+ PV + ", articleAmount=" + articleAmount + ", messageAmount="
				+ messageAmount + "]";
	}

}
