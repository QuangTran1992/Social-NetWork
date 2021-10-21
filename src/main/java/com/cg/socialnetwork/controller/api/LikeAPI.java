package com.cg.socialnetwork.controller.api;

import com.cg.socialnetwork.model.Like;
import com.cg.socialnetwork.service.LikeService.ILikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/likes")
public class LikeAPI {

    @Autowired
    private ILikeService iLikeService;

    @GetMapping
    public ResponseEntity<Iterable<?>> getAllLike(){
        try {
            Iterable<Like> likes = iLikeService.findAll();

            if (((List) likes).isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return  new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e) {
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping({"/id"})
    public ResponseEntity<Like> findLikeById(@PathVariable long id){
        Optional<Like> likeOptional = iLikeService.findById(id);
        if (!likeOptional.isPresent()){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(likeOptional.get(),HttpStatus.OK);

    }

    @PutMapping({"/id"})
    public ResponseEntity<Like> updateLike(@PathVariable long id , @RequestBody Like like){
        Optional<Like> likeOptional = iLikeService.findById(id);
        if (!likeOptional.isPresent()){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(likeOptional.get(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Like> createLike(@RequestBody Like like){
        return new ResponseEntity<>(iLikeService.save(like),HttpStatus.CREATED);
    }

    @DeleteMapping({"/id"})
    public ResponseEntity<Like> deleteLike(@PathVariable long id ){
        Optional<Like> likeOptional = iLikeService.findById(id);
        if (!likeOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iLikeService.deleteById(id);
        return new ResponseEntity<>(likeOptional.get(), HttpStatus.NO_CONTENT);
    }


}
