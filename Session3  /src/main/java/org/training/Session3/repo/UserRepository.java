package org.training.Session3.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.training.Session3.entities.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    User findByEmail(String email);

    @Query("SELECT u FROM User u WHERE u.username LIKE :character%")
    List<User> findUsersWithCharacter(Character character);

}
