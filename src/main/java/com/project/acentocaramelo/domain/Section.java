package com.project.acentocaramelo.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;

/**
 * @author Carlos Alvarado Núñez
 */
@Entity @Getter @Setter @RequiredArgsConstructor @NoArgsConstructor
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @NonNull
    @NotNull
    private String name;

    @NotNull
    @NonNull
    private String color;

    @Column(name = "background_url")
    private String imageUrl;

    @CreationTimestamp
    private Instant created_time;

    @UpdateTimestamp
    private Instant updated_time;

    private boolean deleted;

    @ManyToOne
    @JoinColumn(name = "Menu_id")
    private Menu menu;

}
