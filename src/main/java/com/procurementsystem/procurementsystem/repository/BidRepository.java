package com.procurementsystem.procurementsystem.repository;

import com.procurementsystem.procurementsystem.model.Bid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidRepository extends JpaRepository<Bid, Long> {
}
