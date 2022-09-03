package com.project.acentocaramelo.api.vm;

import lombok.*;

/**
 * @author Carlos Alvarado Núñez
 * @implNote View model to add role to user
 */

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class RoleToUser {
    private String username;
    private String roleName;
}
