package com.tourism.seligo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDto {
    private Integer driverId;
    private Integer userId; // Linked User ID
    private String vehicleType; // Car, Van, Bus, etc.
    private String plateNumber;
    private double pricePerKm;
    private int seatCount;
    private boolean available;
    private String contactNumber;
    private String profileImage; // Path or URL to profile picture
}
