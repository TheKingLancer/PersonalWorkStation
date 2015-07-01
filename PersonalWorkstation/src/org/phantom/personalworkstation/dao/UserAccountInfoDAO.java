package org.phantom.personalworkstation.dao;

import org.phantom.personalworkstation.entity.UserAccountInfo;

public interface UserAccountInfoDAO {
	public int addUserAccountInfo(UserAccountInfo userAccountInfo);
	public int updateUserAccountInfo(UserAccountInfo userAccountInfo);
	public UserAccountInfo selectUserAccountInfoByUserID(String userID);
}
