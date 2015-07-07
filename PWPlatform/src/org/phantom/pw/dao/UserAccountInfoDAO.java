package org.phantom.pw.dao;

import org.phantom.pw.entity.UserAccountInfo;


public interface UserAccountInfoDAO {
	public int addUserAccountInfo(UserAccountInfo userAccountInfo);
	public int updateUserAccountInfo(UserAccountInfo userAccountInfo);
	public UserAccountInfo selectUserAccountInfoByUserID(String userID);
}
