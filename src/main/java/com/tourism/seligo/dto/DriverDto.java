package com.tourism.seligo.dto;

import com.tourism.seligo.enums.AvailabilityStatus;
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
    private AvailabilityStatus availability; // Enum instead of boolean
    private String contactNumber;
    private String profileImage; // Path or URL to profile picture
    private String licenseImage; // path or URL to license picture
}
