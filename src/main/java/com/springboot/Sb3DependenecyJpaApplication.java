package com.springboot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.springboot.dao.UserRepository;
import com.springboot.entities.User;

@SpringBootApplication
public class Sb3DependenecyJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Sb3DependenecyJpaApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
	
		
		
/* Create user details which is given in CRUD file */
		
		// Single user
		
//		User user = new User();
//		user.setName("Istkaar");
//		user.setCity("Roorkee");
//		user.setStatus("Java");
//		/*Save single user*/
//		User user1 = userRepository.save(user);
//		System.out.println(user1);	
		
		
		
		
		
		
		// Create object of user
		User user1 = new User();
		user1.setName("Mahira Ansari");
		user1.setCity("Shahpur");
		user1.setStatus("Nursery");
		
		
		User user2 = new User();
		user2.setName("shadab Ali");
		user2.setCity("Haldwani");
		user2.setStatus("MBBS");
		
		List<User> users = List.of(user1, user2);
		
		
		/* save multiple objects */
		
		Iterable<User> result = userRepository.saveAll(users);
		result.forEach(	user->{
		System.out.println(user);	
		});
		
		System.out.println("Done");
		
		
		
		
	}

}
