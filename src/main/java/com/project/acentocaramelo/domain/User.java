package com.project.acentocaramelo.domain;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NonNull //lombok
    @Column(unique = true, nullable = false)
    private String username;

    @NonNull //lombok
    @Email
    @Column(unique = true, nullable = false)
    private String email;

    @NotNull
    @NonNull //lombok
    @Column(nullable = false, length = 30)
    private String password;

    @NotNull
    @NonNull //lombok
    @Size(max = 50)
    @Column(name = "first_name", length = 50)
    private String firstName;

    @NotNull
    @NonNull //lombok
    @Size(max = 50)
    @Column(name = "last_name", length = 50)
    private String lastName;

    private Date dob;

    private boolean activated;

    private boolean notifications;

    @Column(name = "created_time")
    private Instant createdTime;

    @Column(name = "updated_time")
    private Instant updatedTime;

    private boolean deleted;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_has_role",
            joinColumns = @JoinColumn(name="user_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name="role_id", referencedColumnName="id"))
    private Collection<Role> roles = new ArrayList<>();

}
