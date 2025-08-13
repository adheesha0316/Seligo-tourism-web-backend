package com.tourism.seligo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cabId;

    private String vehicleType; // car, van, bus
    private String plateNumber;
    private double pricePerKm;
    private int seatCount;
    private boolean available;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL)
    private List<Booking> bookings;
}

