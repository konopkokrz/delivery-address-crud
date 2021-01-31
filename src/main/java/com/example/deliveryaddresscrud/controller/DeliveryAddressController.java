package com.example.deliveryaddresscrud.controller;

import com.example.deliveryaddresscrud.api.DeliveryAddressResponse;
import com.example.deliveryaddresscrud.service.DeliveryAddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("delivery-address")
public class DeliveryAddressController {

    private final DeliveryAddressService deliveryAddressService;

    public DeliveryAddressController(DeliveryAddressService deliveryAddressService) {
        this.deliveryAddressService = deliveryAddressService;
    }


    @GetMapping
    public DeliveryAddressResponse getAllAddresses() {
        DeliveryAddressResponse response = new DeliveryAddressResponse();
        response.setDeliveryAddresses(deliveryAddressService.getAllAddresses());
        return response;
    }

    @GetMapping("/{userId}")
    public DeliveryAddressResponse getAddressByUserId(@PathVariable("userId") Long userId) {
        DeliveryAddressResponse response = new DeliveryAddressResponse();
        response.setDeliveryAddresses(deliveryAddressService.findByUserId(userId));
        return response;
    }
}
