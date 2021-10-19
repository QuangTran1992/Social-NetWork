package com.cg.model;


import com.cg.model.enumModel.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "posts")
public class Post extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(nullable = false)
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(targetEntity = Comment.class,mappedBy = "post")
    private List<Comment> comments;

    private String content;

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
