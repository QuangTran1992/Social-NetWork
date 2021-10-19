package com.cg.model;

import com.cg.model.enumModel.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
    private String u_id;

    private String email;

    @NotBlank
    private String password;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    private Gender gender;

    @ManyToOne
    @JoinColumn(name = "id_city")
    private City city;

    @ManyToOne
    @JoinColumn(name = "id_country")
    private Country country;


    private String image;

    private String background;

    @OneToMany(targetEntity = Post.class,mappedBy = "user")
    private List<Post> posts;

    @OneToMany(targetEntity = Comment.class,mappedBy = "user")
    private List<Comment> comments;

    @OneToMany(targetEntity = Friend.class,mappedBy = "user2")
    private List<Friend> friends;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Like  like;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "address_id", referencedColumnName = "id")
//    private Like like;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user1", referencedColumnName = "user1")
    private Friend friend;


//    @NotBlank
//    private Date time = Calendar.getInstance().getTime();

    private Boolean active;

    private Boolean status = true;

//    public String getTime() {
//        return new SimpleDateFormat("yyyy:MM:dd HH:mm").format(time);
//    }
}
