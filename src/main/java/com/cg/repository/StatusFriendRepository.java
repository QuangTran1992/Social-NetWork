package com.cg.repository;

import com.cg.model.StatusFriend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusFriendRepository extends JpaRepository<StatusFriend, Long> {
}
