package com.project.acentocaramelo.api;

import com.project.acentocaramelo.api.vm.RoleToUser;
import com.project.acentocaramelo.domain.Role;
import com.project.acentocaramelo.domain.User;
import com.project.acentocaramelo.services.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

/**
 * @author Carlos Alvarado Núñez
 */

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserResource {
    private final UserService userService;

    @GetMapping("/user")
    public ResponseEntity<List<User>>getUsers() {
        URI uri  = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("api/user").toUriString());
        return ResponseEntity.created(uri).body(userService.getUsers());
    }

    @PostMapping("/role")
    public ResponseEntity<Role>saveUser(Role role) {
        URI uri  = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("api/user").toUriString());
        return ResponseEntity.created(uri).body(userService.saveRole(role));
    }

    @PostMapping("/role/addtouser")
    public ResponseEntity<?>saveUser(@RequestBody RoleToUser roleToUser) {
        userService.addRoleToUser(roleToUser.getUsername(), roleToUser.getRoleName());
        return ResponseEntity.ok().build(); //call build when you're not going to return a body
    }
}
