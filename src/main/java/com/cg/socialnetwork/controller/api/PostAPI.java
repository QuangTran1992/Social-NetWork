package com.cg.socialnetwork.controller.api;

import com.cg.socialnetwork.model.Post;
import com.cg.socialnetwork.model.User;
import com.cg.socialnetwork.service.PostService.IPostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/post")
public class PostAPI {

    @Autowired
    private IPostService postService;

    @GetMapping
    public ResponseEntity<Iterable<?>> findAllPost(){
        try{
            Iterable<Post> posts = postService.findAll();
            if( ((List) posts).isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(posts,HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> findByPost(@PathVariable long id){
        Optional<Post> postOptional = postService.findById(id);
        if(!postOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(postOptional.get(),HttpStatus.OK);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Post> updatePost(@PathVariable long id, @RequestBody Post post){
        Optional<Post> postOptional = postService.findById(id);
        if(!postOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(postOptional.get(),HttpStatus.OK);
        }
    }

//    @PostMapping

}
