package com.cg.socialnetwork.service.Friend;//package com.cg.service.Friend;


import com.cg.socialnetwork.model.Friend;
import com.cg.socialnetwork.repository.FriendRepository;
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
    public Optional<Friend> findById(long id) {
        return friendRepository.findById(id);
    }

    @Override
    public Friend save(Friend friend) {
        return friendRepository.save(friend);
    }

    @Override
    public void deleteById(long id) {
        friendRepository.deleteById(id);
    }
}