package com.project.acentocaramelo.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Carlos Alvarado Núñez
 */

@Entity
@Getter @Setter @RequiredArgsConstructor @NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @NonNull
    @NotNull
    private String name;

}
