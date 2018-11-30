package com.vincent;

import com.vincent.entity.User;
import com.vincent.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner setup(UserRepository userRepository) {
        return (args -> {
            User defaultUser = User.builder().email("vincent1@mail.com").password("123456").build();
            userRepository.save(defaultUser);
        });
    }
}
