package com.thg.accelerator.carpoolbackend.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalTime;

@Table(name = "Carpool Posts")
@Entity
public class CarpoolPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String userName;

    String officeLocation;

    String pickUpLocation;

    LocalTime startingTime;

    LocalTime finishingTime;

    String day;

    BigDecimal price;

    public CarpoolPost(long id, String userName, String officeLocation, String pickUpLocation, LocalTime startingTime, LocalTime finishingTime, String day, BigDecimal price) {
        this.id = id;
    }

    public CarpoolPost(){

    }
}
