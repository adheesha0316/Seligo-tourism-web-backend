package com.tourism.seligo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDto {
    private Integer cabId;
    private String vehicleType;
    private String plateNumber;
    private double pricePerKm;
    private int seatCount;
    private boolean available;
}
