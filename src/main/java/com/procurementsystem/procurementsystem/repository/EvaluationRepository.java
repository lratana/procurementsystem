package com.procurementsystem.procurementsystem.repository;

import com.procurementsystem.procurementsystem.model.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationRepository extends JpaRepository<Evaluation, Integer> {
}
