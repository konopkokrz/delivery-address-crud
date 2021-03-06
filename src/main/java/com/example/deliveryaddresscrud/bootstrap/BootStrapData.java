package com.example.deliveryaddresscrud.bootstrap;

import com.example.deliveryaddresscrud.entity.DeliveryAddress;
import com.example.deliveryaddresscrud.entity.User;
import com.example.deliveryaddresscrud.repository.DeliveryAddressRepository;
import com.example.deliveryaddresscrud.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class BootStrapData implements CommandLineRunner {

    private UserRepository userRepository;
    private DeliveryAddressRepository deliveryAddressRepository;

    public BootStrapData(UserRepository userRepository, DeliveryAddressRepository deliveryAddressRepository) {
        this.userRepository = userRepository;
        this.deliveryAddressRepository = deliveryAddressRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading data..");

        User user = new User();
        user.setUserName("Jan Dolny");
        userRepository.save(user);


        DeliveryAddress deliveryAddress = new DeliveryAddress();
        deliveryAddress.setReceiverName("Jan Dolny");
        deliveryAddress.setStreetName("Ceglana");
        deliveryAddress.setHouseNumber("30E");
        deliveryAddress.setFlatNumber("2A");
        deliveryAddress.setPostalCode("00-000");
        deliveryAddress.setCity("Warszawa");
        deliveryAddress.setAddressName("Dom");
        deliveryAddress.setDefault(true);
        deliveryAddress.setCreationDate(Instant.now().toEpochMilli());
        deliveryAddress.setUserId(user.getId());
        deliveryAddressRepository.save(deliveryAddress);

        System.out.println("Loading data finished.");






    }
}
