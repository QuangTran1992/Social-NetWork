package com.cg.socialnetwork.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "likes")
public class Like extends BaseEntity {

    @EmbeddedId
    private LikeId id;

    @Column(name = "reaction_id",insertable=false, updatable= false)
    private long reactionId;

    @OneToOne
    @JoinColumn(name = "reaction_id", referencedColumnName = "id")
    private Reaction reaction;




}
