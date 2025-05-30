package com.procurementsystem.procurementsystem.repository;

import com.procurementsystem.procurementsystem.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}
