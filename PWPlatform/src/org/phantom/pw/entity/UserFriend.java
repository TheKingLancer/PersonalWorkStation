package org.phantom.pw.entity;

public class UserFriend {
	private String id;
	private String userID;
	private String friendUserID;
	private String createTime;
	private String friendGroupID;
	private String remark;
	private String state;

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

	public String getFriendUserID() {
		return friendUserID;
	}

	public void setFriendUserID(String friendUserID) {
		this.friendUserID = friendUserID;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getFriendGroupID() {
		return friendGroupID;
	}

	public void setFriendGroupID(String friendGroupID) {
		this.friendGroupID = friendGroupID;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "UserFriend [id=" + id + ", userID=" + userID
				+ ", friendUserID=" + friendUserID + ", createTime="
				+ createTime + ", friendGroupID=" + friendGroupID + ", remark="
				+ remark + ", state=" + state + "]";
	}

}
