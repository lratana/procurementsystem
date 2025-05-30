package com.procurementsystem.procurementsystem.repository;

import com.procurementsystem.procurementsystem.model.BudgetRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRequestRepository extends JpaRepository<BudgetRequest,Long> {
}
