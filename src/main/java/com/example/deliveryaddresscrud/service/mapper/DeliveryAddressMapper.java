package com.example.deliveryaddresscrud.service.mapper;

import com.example.deliveryaddresscrud.api.dto.AddDeliveryAddressRequest;
import com.example.deliveryaddresscrud.entity.DeliveryAddress;
import org.springframework.stereotype.Component;

@Component
public class DeliveryAddressMapper {
    public DeliveryAddress map(Long userId, AddDeliveryAddressRequest request) {
        return DeliveryAddress.builder()
                .userId(userId)
                .addressName(request.getAddressName())
                .receiverName(request.getReceiverName())
                .companyName(request.getCompanyName())
                .flatNumber(request.getFlatNumber())
                .houseNumber(request.getHouseNumber())
                .streetName(request.getStreetName())
                .postalCode(request.getPostalCode())
                .isDefault(request.isDefault())
                .city(request.getCity())
                .build();
    }
}
