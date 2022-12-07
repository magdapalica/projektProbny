package com.fdmgroup.springbootprobaexample.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fdmgroup.springbootprobaexample.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findById(Integer id);

}
