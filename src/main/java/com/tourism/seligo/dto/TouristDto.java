package com.tourism.seligo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TouristDto {
    private Integer touristId;
    private Integer userId; // Linked User ID
    private String name;
    private String email;
    private String phoneNumber;
    private String nationality;
    private String passportNumber;
    private String profileImage; // Path or URL to profile picture
}
