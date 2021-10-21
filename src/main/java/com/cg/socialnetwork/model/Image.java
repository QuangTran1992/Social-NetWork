package com.cg.socialnetwork.model;



import com.cg.socialnetwork.model.enumModel.TypeImage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "images")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;


    @Column(nullable = false)
//    @OneToOne
    private String relationId;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TypeImage type;
}
