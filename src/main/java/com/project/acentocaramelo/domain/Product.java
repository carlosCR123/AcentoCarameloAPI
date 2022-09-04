package com.project.acentocaramelo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.Instant;

/**
 * @author Carlos Alvarado Núñez
 */
@Entity
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String description;

    @Column(name = "image")
    private String imageUrl;

    private double price;

    @CreationTimestamp
    private Instant created_time;

    @UpdateTimestamp
    private Instant updated_time;

    private boolean deleted;

}
