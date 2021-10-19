package com.cg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "friends")
public class Friend extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String u_id;

    @OneToOne(mappedBy = "friend")
    private User user1;

    @ManyToOne
    @JoinColumn(name = "user_2")
    private User user2;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "status_id",referencedColumnName = "id")
    private StatusFriend statusFriend;

//    @NotBlank
//    private Date time = Calendar.getInstance().getTime();

    private Boolean deleted = false;


}
