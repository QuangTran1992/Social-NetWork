package com.cg.socialnetwork.repository;//package com.cg.repository;
//

import com.cg.socialnetwork.model.Friend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FriendRepository extends JpaRepository<Friend, Long> {
}
