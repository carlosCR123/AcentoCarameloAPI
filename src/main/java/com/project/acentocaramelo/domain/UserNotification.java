package com.project.acentocaramelo.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Entity
@Getter @Setter @RequiredArgsConstructor @NoArgsConstructor
@Table(name = "usernotification")
public class UserNotification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @NonNull
    @NotNull
    private String Subject;

    @NonNull
    private String Content;

    private boolean readed;

    @CreationTimestamp
    private Instant created_time;

    @UpdateTimestamp
    private Instant updated_time;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private User user;


}