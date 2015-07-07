package org.phantom.pw.service;

import org.phantom.pw.entity.UserAccountInfo;
import org.phantom.pw.entity.UserInfo;
import org.phantom.pw.entity.User;

public interface UserService {
	public boolean addUser(User user);
	public boolean updateUserInfo(UserInfo userInfo);
	public boolean updateUserAccountInfo(UserAccountInfo userAccountInfo);
	public UserAccountInfo selectUserAccountInfoByUserID(String userID);
	public UserInfo selectUserInfoByUserID(String userID);
	public User selectUserByEmail(String email);
}
