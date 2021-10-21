package com.cg.socialnetwork.repository;//package com.cg.repository;
//


import com.cg.socialnetwork.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IImageRepository extends JpaRepository<Image, Long> {
}
