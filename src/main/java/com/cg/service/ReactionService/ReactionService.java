package com.cg.service.ReactionService;


import com.cg.model.Reaction;
import com.cg.repository.IReactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReactionService implements IReactionService{
    @Autowired
    private IReactionRepository iReactionRepository;

    @Override
    public Iterable<Reaction> findAll() {
        return iReactionRepository.findAll();
    }

    @Override
    public Optional<Reaction> findById(Long id) {
        return iReactionRepository.findById(id);
    }

    @Override
    public Reaction save(Reaction reaction) {
        return iReactionRepository.save(reaction);
    }

    @Override
    public void deleteById(Long id) {
        iReactionRepository.deleteById(id);
    }
}
