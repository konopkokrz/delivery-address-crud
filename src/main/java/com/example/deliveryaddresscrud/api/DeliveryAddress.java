package com.example.deliveryaddresscrud.api;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Data
@Entity
public class DeliveryAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private Long userId;
    private String receiverName;
    private String companyName;
    private String streetName;
    private String houseNumber;
    private String flatNumber;
    private String postalCode;
    private String city;
    private String addressName;
    private boolean isDefault;
    private Instant creationDay;
}
