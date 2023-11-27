package com.learn.springstarterlearn;

import com.learn.springstarterlearn.database.repository.UserRepository;
import com.learn.springstarterlearn.services.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStarterLearnApplication {

    public static void main(String[] args) {
        UserService userService;
        try (var context = new ClassPathXmlApplicationContext("contextConfig.xml")) {
            var userrepository = context.getBean("repo1", UserRepository.class);
            userService = context.getBean("user-service", UserService.class);
        }

        System.out.println(userService);

    }

}
