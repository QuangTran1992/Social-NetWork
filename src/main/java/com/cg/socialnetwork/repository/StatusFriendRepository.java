package com.cg.socialnetwork.repository;//package com.cg.repository;


import com.cg.socialnetwork.model.StatusFriend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusFriendRepository extends JpaRepository<StatusFriend, Long> {
}
