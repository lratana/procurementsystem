package com.procurementsystem.procurementsystem.repository;

import com.procurementsystem.procurementsystem.model.DeliveryReceipt;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DeliveryReceiptRepository extends JpaRepository<DeliveryReceipt, Long> {
}
