package com.example.achwek.Repository;


import com.example.achwek.Models.ERole;
import com.example.achwek.Models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role>  findByName(ERole name);
}
