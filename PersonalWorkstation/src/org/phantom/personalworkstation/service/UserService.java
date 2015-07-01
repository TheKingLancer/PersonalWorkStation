package org.phantom.personalworkstation.service;

import org.phantom.personalworkstation.entity.UserInfo;
import org.phantom.personalworkstation.entity.UserLogin;

public interface UserService {
	public boolean addUser(UserLogin userLogin);
	public boolean updateUserInfo(UserInfo userInfo);
	public UserInfo selectUserInfoByUserID(String userID);
	public UserLogin selectUserByEmail(String email);
}
