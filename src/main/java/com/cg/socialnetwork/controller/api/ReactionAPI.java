package com.cg.socialnetwork.controller.api;

import com.cg.socialnetwork.model.Post;
import com.cg.socialnetwork.model.Reaction;
import com.cg.socialnetwork.repository.IReactionRepository;
import com.cg.socialnetwork.service.ReactionService.IReactionService;
import com.sun.xml.internal.ws.wsdl.writer.document.Port;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class ReactionAPI {

    @Autowired
    private IReactionService reactionService;

    @GetMapping
    public ResponseEntity<Iterable<?>> findAllReactionByPost(){
        try{
            Iterable<Reaction> reactions = reactionService.findAll();
            if(((List) reactions).isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(reactions,HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reaction> findReactionById(@PathVariable long id){
        Optional<Reaction>  reactionOptional = reactionService.findById(id);
        if(!reactionOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(reactionOptional.get(),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Reaction> updateReaction(@PathVariable long id, @RequestBody Reaction reaction){
        Optional<Reaction> reactionOptional = reactionService.findById(id);
        if(!reactionOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        reaction.setId(reactionOptional.get().getId());
        return new ResponseEntity<>(reactionService.save(reaction),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Reaction> createPost(@RequestBody Reaction reaction){
        return new ResponseEntity<>(reactionService.save(reaction),HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Reaction> deletePost(@PathVariable long id){
        Optional<Reaction> postOptional = reactionService.findById(id);
        if(!postOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
//        reactionService.deleteById(id);
        return new ResponseEntity<>(postOptional.get(),HttpStatus.NO_CONTENT);
    }

}
