package com.project.fullStackBackEnd.repository;

import com.project.fullStackBackEnd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}
