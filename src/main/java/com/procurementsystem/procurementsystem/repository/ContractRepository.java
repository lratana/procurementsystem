package com.procurementsystem.procurementsystem.repository;

import com.procurementsystem.procurementsystem.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract,Long> {
}
