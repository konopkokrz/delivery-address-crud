package com.example.deliveryaddresscrud.api.dto;

import com.example.deliveryaddresscrud.entity.DeliveryAddress;
import lombok.Data;

import java.util.Collection;


@Data
public class DeliveryAddressResponse {

    Collection<DeliveryAddress> deliveryAddresses;
}
