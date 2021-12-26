package com.mscourse.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.mscourse.hruser.entities.User;


@EnableJpaRepositories
public interface userRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
