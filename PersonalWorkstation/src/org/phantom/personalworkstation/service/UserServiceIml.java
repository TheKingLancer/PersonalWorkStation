package org.phantom.personalworkstation.service;

import org.phantom.personalworkstation.dao.UserAccountInfoDAO;
import org.phantom.personalworkstation.dao.UserInfoDAO;
import org.phantom.personalworkstation.dao.UserLoginDAO;
import org.phantom.personalworkstation.entity.UserAccountInfo;
import org.phantom.personalworkstation.entity.UserInfo;
import org.phantom.personalworkstation.entity.UserLogin;
import org.springframework.transaction.annotation.Transactional;

public class UserServiceIml implements UserService {
	private UserLoginDAO userLoginDAO;
	private UserInfoDAO userInfoDAO;
	private UserAccountInfoDAO userAccountInfoDAO;
	
	public UserAccountInfoDAO getUserAccountInfoDAO() {
		return userAccountInfoDAO;
	}

	public void setUserAccountInfoDAO(UserAccountInfoDAO userAccountInfoDAO) {
		this.userAccountInfoDAO = userAccountInfoDAO;
	}

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
	//Ìí¼ÓÓÃ»§
	public boolean addUser(UserLogin userLogin) {
		this.userLoginDAO.addUser(userLogin);
		UserInfo userInfo = new UserInfo();
		userInfo.setUserID(userLogin.getId());
		this.userInfoDAO.addUserInfo(userInfo);
		UserAccountInfo userAccountInfo = new UserAccountInfo();
		userAccountInfo.setUserID(userLogin.getId());
		this.userAccountInfoDAO.addUserAccountInfo(userAccountInfo);
		return false;
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

	@Override
	public boolean updateUserAccountInfo(UserAccountInfo userAccountInfo) {
		return this.userAccountInfoDAO.updateUserAccountInfo(userAccountInfo)>0;
	}

	@Override
	public UserAccountInfo selectUserAccountInfoByUserID(String userID) {
		return this.selectUserAccountInfoByUserID(userID);
	}
	
	

}
