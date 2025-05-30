package com.procurementsystem.procurementsystem.repository;

import com.procurementsystem.procurementsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
}
