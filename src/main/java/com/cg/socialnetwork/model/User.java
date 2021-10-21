package com.cg.socialnetwork.model;

import com.cg.socialnetwork.model.enumModel.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
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

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private int city;

    private int country;

    private String image;

    private String background;

//    @OneToMany(targetEntity = Post.class,mappedBy = "user",cascade = CascadeType.ALL)
//    private List<Post> posts;
//
//    @OneToMany(targetEntity = Comment.class,mappedBy = "user",cascade = CascadeType.ALL)
//    private List<Comment> comments;
//
//    @OneToMany(targetEntity = Friend.class,mappedBy = "userFriend",cascade = CascadeType.ALL)
//    private List<Friend> friends;
//
//    @OneToMany(targetEntity = Like.class,mappedBy = "user", cascade = CascadeType.ALL)
//    private List<Like> likes;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user", referencedColumnName = "user")
//    private Friend friend;

//    private Boolean active;
//
//    private Boolean status = true;

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

//    public UserDTO toUserDTO(){
//        return new UserDTO()
//                .setUId(uID)
//                .setFirstName(firstName)
//                .setLastName(lastName)
//                .setGender(gender)
//                .setCity(city)
//                .setCounty(country);
//    }
}
