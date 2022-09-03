package com.project.acentocaramelo.services;

import com.project.acentocaramelo.domain.Role;
import com.project.acentocaramelo.domain.User;

import java.util.List;

/**
 * @author Carlos Alvarado Núñez
 */
public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
