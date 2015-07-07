package org.phantom.pw.entity;

/**
 * 
 * @author phantom14k 用户统计信息
 *
 */
public class UserAccountInfo {
	private String id;
	private String userID;
	private String updateTime;// 更新时间
	private int PV;// 访问量
	private int articleAmount;// 文章数
	private int messageAmount;// 留言量

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
