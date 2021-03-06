package com.cg.socialnetwork.repository;//package com.cg.repository;


import com.cg.socialnetwork.model.User;
import com.cg.socialnetwork.model.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select new com.cg.socialnetwork.model.dto.UserDTO " +
            "(c.id, c.firstName, c.lastName, c.password, c.email, c.country, c.city, c.media.title, c.background) " +
            "from User c")
    Iterable<UserDTO> findAllUserDTO();

    Optional<User> findByEmailAndPassword(String email, String password);

    Optional<User> findByEmail(String email);
}
