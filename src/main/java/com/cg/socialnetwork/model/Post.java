package com.cg.socialnetwork.model;


import com.cg.socialnetwork.model.enumModel.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "posts")
public class Post extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

//    @OneToMany(targetEntity = Comment.class,mappedBy = "post",cascade = CascadeType.ALL)
//    private List<Comment> comments;

    private String content;

    @Enumerated(EnumType.STRING)
    private Type type;

//    @Column(nullable = false)
//    private String post_Url;

//    private Date date_Created;
//
//    private Date date_Updated;
//
//    public  String getUpdate(Date date) {
//        return  new SimpleDateFormat("yyyy:MM:dd HH:mm").format(date);
//    }
}
