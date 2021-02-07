package com.example.deliveryaddresscrud.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
    private Long creationDate;

    @PrePersist
    protected void onCreate() {
        creationDate = Instant.now().toEpochMilli();
    }
}
