package com.example.deliveryaddresscrud.controller;

import com.example.deliveryaddresscrud.api.dto.AddDeliveryAddressRequest;
import com.example.deliveryaddresscrud.api.dto.DeliveryAddressResponse;
import com.example.deliveryaddresscrud.service.DeliveryAddressService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

    @PostMapping("/{userId}")
    public void addDeliveryAddress(@PathVariable("userId") Long userId, @Valid @RequestBody AddDeliveryAddressRequest request) {
        deliveryAddressService.addDeliveryAddress(userId, request);
    }
}
