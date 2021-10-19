package com.cg.service.StatusFriend;

import com.cg.model.StatusFriend;
import com.cg.repository.StatusFriendRepository;
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
    public Optional<StatusFriend> findById(Long id) {
        return statusFriendRepository.findById(id);
    }

    @Override
    public StatusFriend save(StatusFriend statusFriend) {
        return statusFriendRepository.save(statusFriend);
    }

    @Override
    public void deleteById(Long id) {
        statusFriendRepository.deleteById(id);
    }
}
