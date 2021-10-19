package com.cg.model;


import com.cg.model.enumModel.TypeImage;
import com.sun.istack.Nullable;
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
    private String u_id;

    @Column(nullable = false)
    private String name;


    @Column(nullable = false)
//    @OneToOne
    private String relation_id;

    @Column(nullable = false)
    private TypeImage type;
}
