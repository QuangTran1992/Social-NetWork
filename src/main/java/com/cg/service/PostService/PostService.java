package com.cg.service.PostService;


import com.cg.model.Post;
import com.cg.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService implements IPostService {
    @Autowired
    private IPostRepository iPostRepository;

    @Override
    public Iterable<Post> findAll() {
        return iPostRepository.findAll();
    }

    @Override
    public Optional<Post> findById(Long id) {
        return iPostRepository.findById(id);
    }

    @Override
    public Post save(Post post) {
        return iPostRepository.save(post);
    }

    @Override
    public void deleteById(Long id) {
        iPostRepository.deleteById(id);
    }
}
