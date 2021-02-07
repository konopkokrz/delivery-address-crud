package com.example.deliveryaddresscrud.service;

import com.example.deliveryaddresscrud.api.dto.AddDeliveryAddressRequest;
import com.example.deliveryaddresscrud.entity.DeliveryAddress;

import java.util.Collection;

public interface DeliveryAddressService {

    Collection<DeliveryAddress> getAllAddresses();

    Collection<DeliveryAddress> findByUserId(Long userId);

    void addDeliveryAddress(Long userId, AddDeliveryAddressRequest request);
}
