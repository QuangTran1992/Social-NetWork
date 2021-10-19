package com.cg.service.Friend;

import com.cg.model.Friend;
import com.cg.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class FriendService implements IFriendService{

    @Autowired
    private FriendRepository friendRepository;

    @Override
    public Iterable<Friend> findAll() {
        return friendRepository.findAll();
    }

    @Override
    public Optional<Friend> findById(Long id) {
        return friendRepository.findById(id);
    }

    @Override
    public Friend save(Friend friend) {
        return friendRepository.save(friend);
    }

    @Override
    public void deleteById(Long id) {
        friendRepository.deleteById(id);
    }
}
