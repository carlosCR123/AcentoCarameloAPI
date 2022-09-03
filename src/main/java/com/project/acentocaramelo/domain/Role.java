package com.project.acentocaramelo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Carlos Alvarado Núñez
 */
@Entity
@Table(name = "role")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Role {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

}