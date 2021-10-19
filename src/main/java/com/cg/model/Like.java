package com.cg.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "likes")
public class Like extends BaseEntity{

    @Id
    @Column(name = "user_id")
    private String user_Id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

//    @OneToOne(mappedBy = "user_id")
//    private User user;

    @Id
    private String post_Id;

    @Column(nullable = false)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reaction_id",referencedColumnName = "id")
    private Reaction reaction_Id;

//    private Date date_Created;

}
