package org.phantom.personalworkstation.service;

import org.phantom.personalworkstation.dao.UserInfoDAO;
import org.phantom.personalworkstation.dao.UserLoginDAO;
import org.phantom.personalworkstation.entity.UserInfo;
import org.phantom.personalworkstation.entity.UserLogin;
import org.springframework.transaction.annotation.Transactional;

public class UserServiceIml implements UserService {
	private UserLoginDAO userLoginDAO;
	private UserInfoDAO userInfoDAO;
	public UserInfoDAO  getUserInfoDAO() {
		return userInfoDAO;
	}

	public void setUserInfoDAO(UserInfoDAO userInfoDAO) {
		this.userInfoDAO = userInfoDAO;
	}

	public UserLoginDAO getUserLoginDAO() {
		return userLoginDAO;
	}

	public void setUserLoginDAO(UserLoginDAO userLoginDAO) {
		this.userLoginDAO = userLoginDAO;
	}

	@Override
	@Transactional
	public boolean addUser(UserLogin userLogin) {
		this.userLoginDAO.addUser(userLogin);
		UserInfo userInfo = new UserInfo();
		userInfo.setUserID(userLogin.getId());
		this.userInfoDAO.addUserInfo(userInfo);
		return true;
	}

	@Override
	public UserLogin selectUserByEmail(String email) {
		return this.userLoginDAO.selectUserByEmail(email);
	}

	@Override
	public boolean updateUserInfo(UserInfo userInfo) {
		return this.userInfoDAO.updateUserInfo(userInfo)>0;
	}

	@Override
	public UserInfo selectUserInfoByUserID(String userID) {
		return this.userInfoDAO.selectUserInfoByUserID(userID);
	}
	
	

}
