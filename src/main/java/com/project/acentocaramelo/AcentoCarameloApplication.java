package com.project.acentocaramelo;

import com.project.acentocaramelo.domain.Role;
import com.project.acentocaramelo.domain.User;
import com.project.acentocaramelo.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class AcentoCarameloApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcentoCarameloApplication.class, args);
    }

//    @Bean
//    PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }

    /**
     * Initialize application
     * */
//    @Bean
//    CommandLineRunner run(UserService userService) {
//        return args -> {
////            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
////            userService.saveRole(new Role(null, "ROLE_ADMIN"));
////            userService.saveRole(new Role(null, "ROLE_USER"));
////
//            userService.saveUser(new User("calvarado", "calvarado@gmail.com", "password", "Carlos", "Alvarado"));
//            userService.saveUser(new User("karaya", "karaya@gmail.com", "password", "Karen", "Araya"));
//
//            userService.addRoleToUser("calvarado", "ROLE_SUPER_ADMIN");
//            userService.addRoleToUser("calvarado", "ROLE_ADMIN");
//            userService.addRoleToUser("calvarado", "ROLE_USER");
//            userService.addRoleToUser("karaya", "ROLE_ADMIN");
//            userService.addRoleToUser("karaya", "ROLE_USER");
//        };
//    }

}
