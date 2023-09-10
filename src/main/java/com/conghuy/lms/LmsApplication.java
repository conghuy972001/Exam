package com.conghuy.lms;

import com.conghuy.lms.entity.Role;
import com.conghuy.lms.entity.User;
import com.conghuy.lms.entity.UserRole;
import com.conghuy.lms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class LmsApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(LmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code");

/*		User user = new User();
		user.setFullName("Nguyen Cong Huy");
		user.setUsername("conghuy972001");
		user.setPassword("conghuy7a3");
		user.setEmail("conghuy972001@gmail.com");
		user.setProfile("huy.png");

		Role role1 = new Role();
		role1.setRoleId(44L);
		role1.setRoleName("ADMIN");

		Set<UserRole> userRoleSet = new HashSet<>();
		UserRole userRole = new UserRole();
		userRole.setRole(role1);
		userRole.setUser(user);
		userRoleSet.add(userRole);

		User user1 = this.userService.createUser(user, userRoleSet);
		System.out.println(user1.getUsername());*/

	}
}
