package com.example.deliveryaddresscrud.service;

import com.example.deliveryaddresscrud.api.DeliveryAddress;

import java.util.Collection;

public interface DeliveryAddressService {

    Collection<DeliveryAddress> getAllAddresses();

    Collection<DeliveryAddress> findByUserId(Long userId);
}
