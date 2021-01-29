package com.example.deliveryaddresscrud.repository;

import com.example.deliveryaddresscrud.api.DeliveryAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliveryAddressRepository extends JpaRepository<DeliveryAddress, Long> {

    List<DeliveryAddress> findAll();

    List<DeliveryAddress> findByUserId(Long userId);
}
