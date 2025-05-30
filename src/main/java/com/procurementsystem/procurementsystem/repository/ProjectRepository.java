package com.procurementsystem.procurementsystem.repository;

import com.procurementsystem.procurementsystem.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
