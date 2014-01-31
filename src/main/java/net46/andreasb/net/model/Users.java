package net46.andreasb.net.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Users {
	
	private User user1;
	

	public User getUser1() {
		return user1;
	}

	public void setUser1(User user1) {
		user1.setId("1");
		user1.setPassword("pass");
		
		this.user1 = user1;
	}
	

}
