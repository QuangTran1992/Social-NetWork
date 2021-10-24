package com.cg.socialnetwork.model;

import com.cg.socialnetwork.model.enumModel.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "users")
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;

    @NotBlank
    private String password;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotBlank
    private Date dateOfBirth;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private int city;

    private int country;

    @Column(name = "image_id",insertable=false, updatable= false)
    private long mediaId;

    @ManyToOne
    @JoinColumn(name = "image_id",referencedColumnName = "id")
    private Media media;

    @ManyToOne
    @JoinColumn(name = "role_id",referencedColumnName = "id")
    private Role role;

    private String background;

    private Boolean status = true;

    public User(long id, String email, @NotBlank String password, @NotBlank String firstName,
                @NotBlank String lastName, Gender gender, int city, int country) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.city = city;
        this.country = country;
    }

    public User(String email, @NotBlank String password, @NotBlank String firstName, @NotBlank String lastName, @NotBlank Date dateOfBirth, Gender gender) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }
}
