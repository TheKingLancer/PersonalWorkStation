package org.phantom.pw.dao;

import org.phantom.pw.entity.UserInfo;


public interface UserInfoDAO {
	public int addUserInfo(UserInfo userInfo);
	public int updateUserInfo(UserInfo userInfo);
	public UserInfo selectUserInfoByUserID(String userID);
}
