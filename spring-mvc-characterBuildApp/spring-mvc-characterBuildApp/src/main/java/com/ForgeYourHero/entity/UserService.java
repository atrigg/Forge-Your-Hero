package com.ForgeYourHero.entity;


import java.util.ArrayList;
import java.util.List;

//import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	public List<User> userList = new ArrayList<>();

	public int createUserId() {
		int counter = userList.size() + 1;
		counter++;
		return counter;
	}

	public User findByEmail(String email) {
		User u1 = new User();
		for (User temp : userList) {
			if (temp.getEmail().equals(email)) {
				u1 = temp;
				return u1;
			}

		}
		return null;
	}

	public User findById(String userName) {
		User u1 = new User();
		for (User temp : userList) {
			if (temp.getUserName() == userName) {
				u1 = temp;
				return u1;

			}
		}
		return null;
	}
	public List<User> listAllUsers() {
		return userList;
	}
	
	//@PostConstruct
	//public void defaultAccount() {
		//User u1 = new User(1, "Aaron", "Trigg", "aaron@gmail.com", "yaaay");
		//userList.add(u1);
	//}
}
