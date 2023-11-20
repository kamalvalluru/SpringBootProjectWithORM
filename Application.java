package com.spring.first;

import org.hibernate.mapping.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.first.dao.UserInterface;
import com.spring.first.entities.User;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(Application.class, args);
		
		UserInterface bean = context.getBean(UserInterface.class);
		
		User user=new User();
		user.setName("Kamal Basha Valluru");
		user.setCity("Proddatur");
		user.setSataus("Software Engineer");	
		User save = bean.save(user);
//		System.out.println(save);
//		user.setName("Chakri");
//		user.setCity("Banaglore");
//		user.setSataus("Tcs Employ");		
//		User save2 = bean.save(user);
//		System.out.println(save2);
//		
		/* bean.deleteById(1); */
	}

}
