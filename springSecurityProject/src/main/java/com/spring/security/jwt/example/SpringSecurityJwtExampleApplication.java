package com.spring.security.jwt.example;

import com.spring.security.jwt.example.entity.User;
import com.spring.security.jwt.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtExampleApplication {


	@Autowired
	private UserRepository userRepository;

    @PostConstruct
	public void initUsers(){

		List<User> users = Stream.of(
				new User(101,"anurag","anurag","anurag@gmail.com"),
				new User(102,"rohit","rohit","rohit@gmail.com")
		).collect(Collectors.toList());

		userRepository.saveAll(users);
	}


	public static void main(String[] args) {
    	SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
	}

}
