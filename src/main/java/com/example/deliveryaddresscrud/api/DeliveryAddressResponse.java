package com.example.deliveryaddresscrud.api;

import lombok.Data;

import java.util.Collection;

@Data
public class DeliveryAddressResponse {

    Collection<DeliveryAddress> deliveryAddresses;
}
