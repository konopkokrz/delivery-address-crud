package com.example.deliveryaddresscrud.api.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Data
public class AddDeliveryAddressRequest {

    private final static String POSTAL_CODE_PATTERN = "[0-9]{2}-[0-9]{3}";

    @NotNull
    @Size(max = 255, message = "Max size is 255 characters")
    private String receiverName;

    private String companyName;

    @NotNull
    @Size(max = 255, message = "Max size is 255 characters")
    private String streetName;

    @NotNull
    @Size(max = 255, message = "Max size is 255 characters")
    private String houseNumber;

    private String flatNumber;

    @Size(max = 6, message = "Postal code must have 6 characters. ")
    @Pattern(regexp = POSTAL_CODE_PATTERN, message = " Postal code must be in 00-000 format. ")
    private String postalCode;

    @NotNull
    @Size(max = 255, message = "Max size is 255 characters")
    private String city;

    @NotNull
    @Size(min = 1, max = 255, message = "Address name must be between 1 and 255 characters. ")
    private String addressName;

    @NotNull
    private boolean isDefault;
}
