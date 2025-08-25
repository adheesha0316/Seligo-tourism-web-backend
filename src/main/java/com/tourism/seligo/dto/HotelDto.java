package com.tourism.seligo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelDto {
    private Integer hotelId;
    private Integer userId; // Linked User ID
    private String hotelName;
    private String location;
    private double pricePerNight;
    private String contactNumber;
    private int stars;
    private String profileImage; // Path or URL to profile picture
}
