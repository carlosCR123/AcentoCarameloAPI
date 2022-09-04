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
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @NonNull
    @NotNull
    private String name;

    @NonNull
    @NotNull
    private String description;

    @NonNull
    @NotNull
    private Instant start_time;

    @NonNull
    @NotNull
    private Instant end_time;

    private double discount;

    @Column(name = "background_image")
    private String imageUrl;

    @CreationTimestamp
    private Instant created_time;

    @UpdateTimestamp
    private Instant updated_time;

    private boolean deleted;

}
