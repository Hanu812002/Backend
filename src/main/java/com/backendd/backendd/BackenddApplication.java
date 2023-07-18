package com.backendd.backendd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
// import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;

import com.backendd.backendd.entities.User;
import com.backendd.backendd.repository.userrepo;

@SpringBootApplication
public class BackenddApplication {

	public static void main(String[] args) {
		// SpringApplication.run(BackenddApplication.class, args);
		ApplicationContext context= SpringApplication.run(BackenddApplication.class, args);
		userrepo userr= context.getBean(userrepo.class);
		User u=new User();
		u.setName("Hanu");
		u.setCity("Meerut");
		u.setStatus("Unemployed");
		
		User un=userr.save(u);
		System.out.println(un);
	}

}
