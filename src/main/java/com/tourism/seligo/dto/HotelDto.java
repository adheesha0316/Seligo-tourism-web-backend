package com.tourism.seligo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelDto {
    private Integer hotelId;
    private String hotelName;
    private String location;
    private double pricePerNight;
    private String contactNumber;
    private int stars;
}
