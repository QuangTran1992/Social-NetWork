package com.cg.socialnetwork.service.StatusFriend;//package com.cg.service.StatusFriend;

import com.cg.socialnetwork.model.StatusFriend;
import com.cg.socialnetwork.repository.StatusFriendRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class StatusFriendService implements IStatusFriend{

    @Autowired
    private StatusFriendRepository statusFriendRepository;

    @Override
    public Iterable<StatusFriend> findAll() {
        return statusFriendRepository.findAll();
    }

    @Override
    public Optional<StatusFriend> findById(long id) {
        return statusFriendRepository.findById(id);
    }

    @Override
    public StatusFriend save(StatusFriend statusFriend) {
        return statusFriendRepository.save(statusFriend);
    }

    @Override
    public void deleteById(long id) {
        statusFriendRepository.deleteById(id);
    }
}
