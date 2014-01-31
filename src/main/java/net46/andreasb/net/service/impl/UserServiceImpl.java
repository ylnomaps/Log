package net46.andreasb.net.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import net46.andreasb.net.dao.UserDao;
import net46.andreasb.net.model.User;
import net46.andreasb.net.service.UserService;

public class UserServiceImpl implements UserService {
	
	/* core DAOs */
	@Autowired private UserDao userDao;
	
	/* singleton pattern. */
	private UserServiceImpl() { }
	private static UserServiceImpl instance = new UserServiceImpl();
	public static UserServiceImpl getInstance() { return instance; }
	
	/* interface methods */
	public boolean login(String id, String password) {
		User user = userDao.getUser(id);
		
		if(user != null) {
			if(user.getPassword().equals(password)) {
				return true;
			}
			else {
				return false;
			}
		}
		
		// No such user.
		else {
			return false;
		}
	}
}
