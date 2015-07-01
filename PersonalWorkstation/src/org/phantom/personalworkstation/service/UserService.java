package org.phantom.personalworkstation.service;

import org.phantom.personalworkstation.entity.UserAccountInfo;
import org.phantom.personalworkstation.entity.UserInfo;
import org.phantom.personalworkstation.entity.UserLogin;

public interface UserService {
	public boolean addUser(UserLogin userLogin);
	public boolean updateUserInfo(UserInfo userInfo);
	public boolean updateUserAccountInfo(UserAccountInfo userAccountInfo);
	public UserAccountInfo selectUserAccountInfoByUserID(String userID);
	public UserInfo selectUserInfoByUserID(String userID);
	public UserLogin selectUserByEmail(String email);
}
