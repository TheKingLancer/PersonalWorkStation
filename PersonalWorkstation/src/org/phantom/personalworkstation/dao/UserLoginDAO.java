package org.phantom.personalworkstation.dao;

import org.phantom.personalworkstation.entity.UserLogin;

public interface UserLoginDAO {
	public int addUser(UserLogin userLogin);
		
    public UserLogin selectUserByEmail(String email);
}
