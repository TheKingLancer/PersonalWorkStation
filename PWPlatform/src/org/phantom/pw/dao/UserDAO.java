package org.phantom.pw.dao;

import org.phantom.pw.entity.User;


public interface UserDAO {
	public int addUser(User user);
		
    public User selectUserByEmail(String email);
}
