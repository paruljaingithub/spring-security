package com.security.authdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.authdemo.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
