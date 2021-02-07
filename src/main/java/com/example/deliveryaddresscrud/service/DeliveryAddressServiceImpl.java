package com.example.deliveryaddresscrud.service;

import com.example.deliveryaddresscrud.api.dto.AddDeliveryAddressRequest;
import com.example.deliveryaddresscrud.entity.DeliveryAddress;
import com.example.deliveryaddresscrud.repository.DeliveryAddressRepository;
import com.example.deliveryaddresscrud.service.mapper.DeliveryAddressMapper;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DeliveryAddressServiceImpl implements DeliveryAddressService {

    private final DeliveryAddressMapper deliveryAddressMapper;
    private final DeliveryAddressRepository deliveryAddressRepository;

    public DeliveryAddressServiceImpl(DeliveryAddressMapper deliveryAddressMapper,
                                      DeliveryAddressRepository deliveryAddressRepository) {
        this.deliveryAddressMapper = deliveryAddressMapper;
        this.deliveryAddressRepository = deliveryAddressRepository;
    }


    public Collection<DeliveryAddress> getAllAddresses() {
        return deliveryAddressRepository.findAll();
    }

    @Override
    public Collection<DeliveryAddress> findByUserId(Long userId) {
        return deliveryAddressRepository.findAllByUserId(userId);
    }

    @Override
    public void addDeliveryAddress(Long userId, AddDeliveryAddressRequest request) {
        DeliveryAddress deliveryAddress = deliveryAddressMapper.map(userId, request);
        deliveryAddressRepository.save(deliveryAddress);
    }
}
