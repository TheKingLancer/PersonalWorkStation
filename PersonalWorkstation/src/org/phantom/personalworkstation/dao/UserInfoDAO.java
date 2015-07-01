package org.phantom.personalworkstation.dao;

import org.phantom.personalworkstation.entity.UserInfo;

public interface UserInfoDAO {
	public int addUserInfo(UserInfo userInfo);
	public int updateUserInfo(UserInfo userInfo);
	public UserInfo selectUserInfoByUserID(String userID);
}
