package org.phantom.personalworkstation.test;

import org.junit.Test;
import org.phantom.personalworkstation.entity.UserAccountInfo;
import org.phantom.personalworkstation.entity.UserInfo;
import org.phantom.personalworkstation.entity.UserLogin;
import org.phantom.personalworkstation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DAOTest {

	@Test
	public void addUser() {
		UserLogin user = new UserLogin();
		user.setEmail("6223w22212122");
		user.setPassword("");
		user.setVerify(false);
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		((UserService)ac.getBean("userService")).addUser(user);
		System.out.println(user.getId());
	}
	@Test
	public void selectUserByEmail() {
		UserLogin user = new UserLogin();
		user.setEmail("6223w22112");
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		UserLogin userLogin=((UserService)ac.getBean("userService")).selectUserByEmail(user.getEmail());
		System.out.println(userLogin);
	}
	@Test
	public void selectUserByUserID() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		UserInfo userInfo=((UserService)ac.getBean("userService")).selectUserInfoByUserID("de5a4c14-70e9-1033-a9cc-6e2672c89590");
		userInfo.setSex(1);
		((UserService)ac.getBean("userService")).updateUserInfo(userInfo);
		UserAccountInfo userAccountInfo = new UserAccountInfo();
		userAccountInfo.setPV(2123);
		((UserService)ac.getBean("userService")).updateUserAccountInfo(userAccountInfo);
		System.out.println(userInfo);
	}
}
