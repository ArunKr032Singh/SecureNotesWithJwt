package com.nontech.SecurityWithJwt.repositotry;

import com.nontech.SecurityWithJwt.models.AppRole;
import com.nontech.SecurityWithJwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}