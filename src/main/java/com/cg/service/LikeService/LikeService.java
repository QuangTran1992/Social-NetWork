package com.cg.service.LikeService;


import com.cg.model.Like;
import com.cg.repository.ILikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LikeService implements ILikeService{
    @Autowired
    private ILikeRepository iLikeRepository;

    @Override
    public Iterable<Like> findAll() {
        return iLikeRepository.findAll();
    }

    @Override
    public Optional<Like> findById(Long id) {
        return iLikeRepository.findById(id);
    }

    @Override
    public Like save(Like like) {
        return iLikeRepository.save(like);
    }

    @Override
    public void deleteById(Long id) {
    iLikeRepository.deleteById(id);
    }
}
