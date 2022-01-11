package com.jakubartlomiej.findyourfriends.user.repository;

import com.jakubartlomiej.findyourfriends.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
