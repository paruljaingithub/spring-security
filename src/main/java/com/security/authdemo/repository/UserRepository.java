package com.security.authdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.security.authdemo.model.AuthUser;

@Repository
public interface UserRepository  extends JpaRepository<AuthUser, Long>  {

	@Query("SELECT a FROM AuthUser a WHERE LOWER(a.userName) = LOWER(:username)")
	AuthUser findByUsername(@Param("username") String username);

	
}
