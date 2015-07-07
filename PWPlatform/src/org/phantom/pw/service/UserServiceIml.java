package org.phantom.pw.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.phantom.pw.dao.UserAccountInfoDAO;
import org.phantom.pw.dao.UserInfoDAO;
import org.phantom.pw.dao.UserDAO;
import org.phantom.pw.entity.UserAccountInfo;
import org.phantom.pw.entity.UserInfo;
import org.phantom.pw.entity.User;
import org.springframework.transaction.annotation.Transactional;


public class UserServiceIml implements UserService {
	private static Log logger = LogFactory.getLog(UserServiceIml.class);
	private UserDAO userDAO;
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

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	//����û�
	public boolean addUser(User user) {

		return true;
	}

	@Override
	public User selectUserByEmail(String email) {
		return this.userDAO.selectUserByEmail(email);
	}

	@Override
	public boolean updateUserInfo(UserInfo userInfo) {
		logger.info("�����û���Ϣ"+userInfo.toString());
		return this.userInfoDAO.updateUserInfo(userInfo)>0;
	}

	@Override
	public UserInfo selectUserInfoByUserID(String userID) {
		return this.userInfoDAO.selectUserInfoByUserID(userID);
	}

	@Override
	public boolean updateUserAccountInfo(UserAccountInfo userAccountInfo) {
		logger.info("�����û�ͳ����Ϣ"+userAccountInfo.toString());
		return this.userAccountInfoDAO.updateUserAccountInfo(userAccountInfo)>0;
	}

	@Override
	public UserAccountInfo selectUserAccountInfoByUserID(String userID) {
		return this.selectUserAccountInfoByUserID(userID);
	}
	
	

}
