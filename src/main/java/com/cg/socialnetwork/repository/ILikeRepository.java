package com.cg.socialnetwork.repository;//package com.cg.repository;
//

import com.cg.socialnetwork.model.Like;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ILikeRepository extends JpaRepository<Like, Long> {
}
