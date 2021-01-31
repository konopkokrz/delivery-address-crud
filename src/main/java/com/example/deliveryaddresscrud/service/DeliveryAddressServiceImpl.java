package com.example.deliveryaddresscrud.service;

import com.example.deliveryaddresscrud.api.DeliveryAddress;
import com.example.deliveryaddresscrud.repository.DeliveryAddressRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DeliveryAddressServiceImpl implements DeliveryAddressService {

    private final DeliveryAddressRepository deliveryAddressRepository;

    public DeliveryAddressServiceImpl(DeliveryAddressRepository deliveryAddressRepository) {
        this.deliveryAddressRepository = deliveryAddressRepository;
    }


    public Collection<DeliveryAddress> getAllAddresses() {
        return deliveryAddressRepository.findAll();
    }

    @Override
    public Collection<DeliveryAddress> findByUserId(Long userId) {
        return deliveryAddressRepository.findAllByUserId(userId);
    }
}
