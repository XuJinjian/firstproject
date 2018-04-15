package com.jinjian.firstproject.repsitory;

import com.jinjian.firstproject.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
