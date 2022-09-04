package com.project.acentocaramelo.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.List;

/**
 * @author Carlos Alvarado Núñez
 */

@Entity
@Getter @Setter @RequiredArgsConstructor @NoArgsConstructor
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @NonNull
    @NotNull
    private String name;

    private String description;

    @Column(name = "background_image")
    private String imageUrl;

    @CreationTimestamp
    private Instant created_time;

    @UpdateTimestamp
    private Instant updated_time;

    private boolean deleted;

    @OneToMany
    @JoinColumn(name = "Menu_id")
    List<Section> sections;

}
