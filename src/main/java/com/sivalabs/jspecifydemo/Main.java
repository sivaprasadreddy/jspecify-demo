package com.sivalabs.jspecifydemo;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		UserRepository userRepository = new UserRepository();
		List<User> users = userRepository.getUsers();
		for (User user : users) {
			System.out.println(user.name());
		}
	}
}