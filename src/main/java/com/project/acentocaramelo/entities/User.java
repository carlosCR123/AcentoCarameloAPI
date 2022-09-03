package com.project.acentocaramelo.entities;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name="user")
public class User {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(unique = true, nullable = false)
    private String username;

    @Email
    @Column(unique = true, nullable = false)
    private String email;

    @NotNull
    @Column(nullable = false, length = 30)
    private String password;

    @NotNull
    @Size(max = 50)
    @Column(name = "first_name", length = 50)
    private String firstName;

    @NotNull
    @Size(max = 50)
    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "activated")
    private boolean activated;

    @Column(name = "notifications")
    private boolean notifications;

    @Column(name = "created_time")
    private Instant createdTime;

    @Column(name = "updated_time")
    private Instant updatedTime;

    @Column(name = "deleted")
    private boolean deleted;

}
